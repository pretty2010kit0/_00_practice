package zhou.socket;
/**socket通信
 * 服务端*/
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**服务端用来接收文件，并且保存到工程的receive文件夹下*/
public class DemoServer {
	public static void main(String[] args) 
		throws Exception {
		ServerSocket ss = new ServerSocket(5000);
		while(true){
			System.out.println("服务器等待接收文件*(-_-)*");
			receiveFile(ss);
		}
	}
	public static void receiveFile(ServerSocket ss) throws Exception{
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		byte[] buf = new byte[100];
		in.read(buf);
		String tl = new String(buf, "utf-8").trim();
		String[] data = tl.split(",");
		String filename = data[0];
		String type = filename.substring(filename.indexOf(".")+1);
		BufferedOutputStream fout = 
				new BufferedOutputStream(/*设置接收文件的文件夹和新文件名*/
						new FileOutputStream("receive/_"+filename));
		long len = Long.parseLong(data[1]);
		for(long i=0; i<len; i++){
			int b = in.read();
			fout.write(b);
		}
		fout.close();
		System.out.println("收到类型为"+type+"的文件："+filename);
	}
}
