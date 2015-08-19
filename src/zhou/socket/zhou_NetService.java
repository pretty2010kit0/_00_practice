<<<<<<< HEAD
package zhou.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/** 网络协议类 
 * 封装send 和  receive 方法
 * 方便Client类和Server类的使用*/
public class zhou_NetService {
	public static void send(
			File file, OutputStream out)
		throws IOException {
		//将文件file 向 out发送
		String header = "file,"+file.getName()+
			","+file.length();
		byte[] bytes = header.getBytes("utf-8");
		bytes = Arrays.copyOf(bytes, 100);
		out.write(bytes);
		InputStream in=new FileInputStream(file);
		int b;
		while((b=in.read())!=-1){
			out.write(b);
		}
		in.close();
		out.flush();
	}
	
	@SuppressWarnings("unused")
	public static void receive(InputStream in)
		throws IOException {
		//从in接收文件
		byte[] buf = new byte[100];
		in.read(buf);
		String header = 
			new String(buf, "utf-8").trim();
		String[] data = header.split(",");
		String type = data[0];
		String filename = data[1];
		long len = Long.parseLong(data[2]);
		FileOutputStream out = 
			new FileOutputStream("receive/_"+filename);
		for(long i=0; i<len; i++){
			int b = in.read();
			out.write(b);
		}
		out.close();
	}
}






=======
package zhou.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/** 网络协议类 
 * 封装send 和  receive 方法
 * 方便Client类和Server类的使用*/
public class zhou_NetService {
	public static void send(
			File file, OutputStream out)
		throws IOException {
		//将文件file 向 out发送
		String header = "file,"+file.getName()+
			","+file.length();
		byte[] bytes = header.getBytes("utf-8");
		bytes = Arrays.copyOf(bytes, 100);
		out.write(bytes);
		InputStream in=new FileInputStream(file);
		int b;
		while((b=in.read())!=-1){
			out.write(b);
		}
		in.close();
		out.flush();
	}
	
	@SuppressWarnings("unused")
	public static void receive(InputStream in)
		throws IOException {
		//从in接收文件
		byte[] buf = new byte[100];
		in.read(buf);
		String header = 
			new String(buf, "utf-8").trim();
		String[] data = header.split(",");
		String type = data[0];
		String filename = data[1];
		long len = Long.parseLong(data[2]);
		FileOutputStream out = 
			new FileOutputStream("receive/_"+filename);
		for(long i=0; i<len; i++){
			int b = in.read();
			out.write(b);
		}
		out.close();
	}
}






>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
