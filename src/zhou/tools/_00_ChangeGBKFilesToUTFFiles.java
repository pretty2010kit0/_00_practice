package zhou.tools;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 将gbk编码的java和txt文件转为utf-8编码的文件
 * @author zhoupc
 * 2015-7-21 上午09:59:26
 */
public class _00_ChangeGBKFilesToUTFFiles {
	
	/**
	 * 删除一个文件夹及这个文件夹下所有文件
	 * @param file 要删除的文件或文件夹
	 */
	private void deleteFile(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for (File f : files) {
				deleteFile(f);
			}
		}
		file.delete();
	}
	
	private void change() throws IOException{
		// GBK编码格式源码路径
		String gbkDirPath = "";
		// 转为UTF-8编码格式源码路径
		String utf8DirPath = "";
		// 进行转换的文件类型
		String[] fileTypes = null;
		// 初始化参数
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read("src/zhou/tools/changeCode.xml");
			Element root = doc.getRootElement();
			List<Element> list = root.elements();
			for (Element ele : list) {
				if("gbkDirPath".equals(ele.getName())){
					gbkDirPath = ele.getTextTrim();
				} else if("utf8DirPath".equals(ele.getName())){
					utf8DirPath = ele.getTextTrim();
				} else if("fileTypes".equals(ele.getName())){
					fileTypes = ele.getTextTrim().split(",");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		// GBK编码格式源码路径
//		String gbkDirPath = "C:\\Users\\zhoupc\\Desktop\\FTP\\day01_am";
//		// 转为UTF-8编码格式源码路径
//		String utf8DirPath = "C:\\Users\\zhoupc\\Desktop\\FTP\\UTF-8";
//		// 删除utf8DirPath文件夹及里面的所有内容
	
		
		deleteFile(new File(utf8DirPath));
		
		// 获取所有java文件
		Collection<File> javaGbkFileCol = FileUtils.listFiles(new File(
				gbkDirPath), fileTypes, true);

		for (File javaGbkFile : javaGbkFileCol) {
			// UTF8格式文件路径
			String utf8FilePath = utf8DirPath
					+ javaGbkFile.getAbsolutePath().substring(
							gbkDirPath.length());
			// 使用GBK读取数据，然后用UTF-8写入数据
			FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils
					.readLines(javaGbkFile, "GBK"));
		}
		System.out.println("转码完成！");
		System.out.println("GBK文件夹：\n" + gbkDirPath);
		System.out.println("UTF-8文件夹：\n" + utf8DirPath);
	}
	
	public static void main(String[] args) {
		_00_ChangeGBKFilesToUTFFiles bean = new _00_ChangeGBKFilesToUTFFiles();
		try {
			bean.change();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
