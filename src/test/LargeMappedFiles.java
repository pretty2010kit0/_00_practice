<<<<<<< HEAD
package test;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

//内存映射文件
public class LargeMappedFiles {
	static int length = 0x8000000; // 128 Mb

	public static void main(String[] args) throws Exception {
		// 为了以可读可写的方式打开文件，这里使用RandomAccessFile来创建文件。
		FileChannel fc = new RandomAccessFile("test.dat", "rw").getChannel();
		//注意，文件通道的可读可写要建立在文件流本身可读写的基础之上
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, length);
		//写128M的内容
		for (int i = 0; i < length; i++) {
			out.put((byte) 'x');
		}
		System.out.println("Finished writing");
		//读取文件中间6个字节内容
		for (int i = length / 2; i < length / 2 + 6; i++) {
			System.out.print((char) out.get(i));
		}
		fc.close();
	}
}
=======
package test;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

//内存映射文件
public class LargeMappedFiles {
	static int length = 0x8000000; // 128 Mb

	public static void main(String[] args) throws Exception {
		// 为了以可读可写的方式打开文件，这里使用RandomAccessFile来创建文件。
		FileChannel fc = new RandomAccessFile("test.dat", "rw").getChannel();
		//注意，文件通道的可读可写要建立在文件流本身可读写的基础之上
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, length);
		//写128M的内容
		for (int i = 0; i < length; i++) {
			out.put((byte) 'x');
		}
		System.out.println("Finished writing");
		//读取文件中间6个字节内容
		for (int i = length / 2; i < length / 2 + 6; i++) {
			System.out.print((char) out.get(i));
		}
		fc.close();
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
