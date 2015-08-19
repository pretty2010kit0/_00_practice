package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFileMethods {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/tarena/workspace5320.zip");
//		File file = new File("/home/tarena/workspace5320");
		
		String getName = file.getName();
		System.out.println("getName:"+getName);
		String getPath = file.getPath();
		System.out.println("getPath:"+getPath);
		String getAbsolutePath = file.getAbsolutePath();
		System.out.println("getAbsolutePath:"+getAbsolutePath);
		//throws IOException
		String getCanonicalPath = file.getCanonicalPath();
		System.out.println("getCanonicalPath:"+getCanonicalPath);
		long length = file.length();
		System.out.println("length:"+length/1024+"KB");
		
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("lastModified:"+sdf.format(date));
		
		boolean exists = file.exists();
		System.out.println("exists:"+exists);
		
		boolean isFile = file.isFile();
		System.out.println("isFile:"+isFile);
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory::"+isDirectory);
		
		boolean canRead = file.canRead();
		System.out.println("canRead:"+canRead);
		boolean canWrite = file.canWrite();
		System.out.println("canWrite:"+canWrite);
		//测试应用程序是否可以执行此抽象路径名表示的文件。
		boolean canExecute = file.canExecute();
		System.out.println("canExecute:"+canExecute);
		
		File[] listFiles = file.listFiles();
		if (listFiles==null) {
			System.out.println("listFiles:"+listFiles);
		} else {
			System.out.println("listFiles:");
			for(File file1:listFiles){
				if (file1.isDirectory()) {
					System.out.println(file1+"/");
					listFile(file1);
				} else {
					System.out.println(file1);
				}
			}
		}
		
	}
	public static void listFile(File file){
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for(File file1:files){
				if (file1.isDirectory()) {
					System.out.println(file1+"/");
					listFile(file1);
				} else {
					System.out.println(file1);
				}
			}
		}
	}
}
