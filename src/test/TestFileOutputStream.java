package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String[] args) throws Exception{
		byte[] c = "tarena".getBytes();
		File f = new File("company.txt");
		try {
//			FileOutputStream out = new FileOutputStream(f,true);//追加写
			FileOutputStream out = new FileOutputStream(f);//默认覆盖写
			out.write(c);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/** 本题考查使用FileOutputStream实现追加写。
 * FileOutputStream类的构造方法FileOutputStream(File,boolean)
 * 的第二构造参数设置为true表示向文件末尾追加写数据(默认为false，覆盖写)*/
