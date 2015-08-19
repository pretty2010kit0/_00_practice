package zhou.socket;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/**客户端用来向服务端发送文件，,要发送的文件放在工程的send文件夹中*/
public class DemoClient {
	public static void main(String[] args) throws Exception{
		File file = new File("send/dom.png");
		sendFile(file);
		file = new File("send/xml.png");
		sendFile(file);
	}
	public static void sendFile(File file) throws Exception{
		Socket s = new Socket("localhost",5000);//"192.168.33.131"
		BufferedInputStream fin =new BufferedInputStream(
				new FileInputStream(file));
		OutputStream out = s.getOutputStream();
		//发送文件：
		//1）先发送100 byte  Type,Length(TL)
		String tl = file.getName()+","+file.length();
		byte[] bytes = tl.getBytes("utf-8");
		bytes =Arrays.copyOf(bytes, 100);//将数组复制扩容到100byte
		out.write(bytes);//发送type，length
		out.flush();
		//2）发送文件数据 Value(V)
		int b;
		while((b=fin.read())!=-1){
			out.write(b);
		}
		out.flush();
		s.close();
		System.out.println("文件"+file.getName()+"发送完成！");
	}
	
}
