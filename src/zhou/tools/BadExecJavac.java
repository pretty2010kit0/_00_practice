package zhou.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 
/**
 * Java获取Windows CMD窗口执行命令的返回信息
 * 
 * @author zhoupc
 * 2015-7-28 上午10:53:25
 */
public class BadExecJavac {
	
    public static void main(String args[]) {
    	args = new String[]{"net start"};
        if (args.length < 1) {
            System.out.println("USAGE: java GoodWindowsExec <cmd>");
            System.exit(1);
        }
 
        try {
            String osName = System.getProperty("os.name" );
            String[] cmd = new String[3];
 
            System.out.println(osName);
            if( osName.equals( "Windows 7" ) ) {
                cmd[0] = "cmd.exe" ;
                cmd[1] = "/C" ;
                cmd[2] = args[0];
            } else if( osName.equals( "Windows NT" ) ) {
                cmd[0] = "cmd.exe" ;
                cmd[1] = "/C" ;
                cmd[2] = args[0];
            } else if( osName.equals( "Windows XP" ) ) {
                cmd[0] = "cmd.exe" ;
                cmd[1] = "/C" ;
                cmd[2] = args[0];
            } else if( osName.equals( "Windows 95" ) ) {
                cmd[0] = "command.com" ;
                cmd[1] = "/C" ;
                cmd[2] = args[0];
            } else {
            	System.out.println("不支持该系统！");
            	return;
            }
 
            Runtime rt = Runtime.getRuntime();
            System.out.println("Execing " + cmd[0] + " " + cmd[1]
                               + " " + cmd[2]);
            Process proc = rt.exec(cmd);
            // any error message?
            StreamGobbler errorGobbler = new
                StreamGobbler(proc.getErrorStream(), "ERROR");
 
            // any output?
            StreamGobbler outputGobbler = new
                StreamGobbler(proc.getInputStream(), "OUTPUT");
 
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
 
            // any error???
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}


class StreamGobbler extends Thread {
    InputStream is;
    String type;
 
    StreamGobbler(InputStream is, String type) {
        this.is = is;
        this.type = type;
    }
 
    public void run() {
        try  {
            InputStreamReader isr = new InputStreamReader(is, "GBK");
            BufferedReader br = new BufferedReader(isr);
            String line=null;
            while ( (line = br.readLine()) != null)
                System.out.println(type + ">" + line);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
 
