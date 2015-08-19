package zhou.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**压缩文件*/
public class _01_MyMultipleFileZip {
	//需要压缩的文件夹路径
	private static String  sourceString = "/home/tarena/Workspaces/workspace5320";
	//压缩后文件存储的文件夹
	private String currentZipFilePath = "/home/tarena/MyZip5320.zip";
	private String sourceFilePath;
	private ZipOutputStream zos;
	private FileInputStream fis;
	public _01_MyMultipleFileZip(String sourceFilePath){
		try {
			this.sourceFilePath = sourceFilePath;
			zos = new ZipOutputStream(
					new FileOutputStream(currentZipFilePath));
			//设定文件压缩级别
			zos.setLevel(9);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	//在当前条目中写入具体内容
	public void writeToEntryZip(String filePath){
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		byte[] buff = new byte[1024];
		int len = 0;
		try {
			while((len=fis.read(buff))!=-1){
				zos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
		//添加文件条目
		public void addFileEntryZip(String fileName){
			try {
				zos.putNextEntry(new ZipEntry(fileName));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void addDirectoryEntryZip(String directoryName){
			try {
				zos.putNextEntry(new ZipEntry(directoryName+"/"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//遍历文件夹
		public void listMyDirectory(String filePath){
			File f = new File(filePath);
			File[] files = f.listFiles();
			for(File currentFile:files) {
				//设置条目名称（此步非常关键）
//				System.out.println(currentFile.getAbsolutePath());
				String entryName = currentFile.getAbsolutePath().split(":")[0].substring(1);
				//获取文件物理路径
				String absolutePath = currentFile.getAbsolutePath();
				if (currentFile.isDirectory()) {
					addDirectoryEntryZip(entryName);
					//进行递归调用
					listMyDirectory(absolutePath);
				} else {
					addFileEntryZip(entryName);
					writeToEntryZip(absolutePath);
				}
			}
		}
		//主要流程
		public void mainWorkFlow(){
			System.out.println("压缩开始，少年！请骚等 *)-_-(*");
			listMyDirectory(this.sourceFilePath);
			if (zos!=null) {
				try {
					zos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("*****压缩完成*****");
		}
		public static void main(String[] args) {
			//需要压缩的源文件
			new _01_MyMultipleFileZip(sourceString).mainWorkFlow();
		}
		
}
