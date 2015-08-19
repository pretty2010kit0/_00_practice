package zhou.socket;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/**客户端，可以接收和发送文件*/
public class zhou_Client {
	public static void main(String[] args) 
		throws Exception {
		Socket s = new Socket("localhost",5000);
		OutputStream out = s.getOutputStream();
		InputStream in = s.getInputStream();
		//将被发送的文件
		File file1 = new File("send/stream.txt");
		File file2 = new File("send/dom.png");
		//发送文件
		zhou_NetService.send(file1, out);
		zhou_NetService.send(file2, out);
		zhou_NetService.receive(in);
		s.close();
	}
}


