package zhou.socket;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**服务端，可接收和发送文件*/
public class zhou_Server {
	public static void main(String[] args) 
		throws Exception {
		ServerSocket ss = new ServerSocket(5000);
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		zhou_NetService.receive(in);
		zhou_NetService.receive(in);
		
		zhou_NetService.send(
				new File("send/xml.png"), out);
		
		s.close();
	}
}

