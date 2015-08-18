package zhou.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.ParseException;
/**复制文件夹及其内容*/
public class TestCopyFolder {
	public static void main(String[] args) throws ParseException {
//		copyFolder("C:/Users/Administrator/Desktop/JSD1405","C:/Users/Administrator/Desktop/JSD1405_01");
		copyFolder("/home/tarena/workspace","/home/tarena/桌面/FTP/workspace");
	}
	
	public static void copyFolder(String oldPath, String newPath) {

		try {
		(new File(newPath)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
		File a = new File(oldPath);
		//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
		String[] file = a.list();
		File temp = null;
		for (int i = 0; i < file.length; i++) {
		if (oldPath.endsWith(File.separator)) {
		temp = new File(oldPath + file[i]);
		} else {
		temp = new File(oldPath + File.separator + file[i]);
		}

		if (temp.isFile()) {
		FileInputStream input = new FileInputStream(temp);
		FileOutputStream output = new FileOutputStream(newPath
		+ "/" + (temp.getName()).toString());
		byte[] b = new byte[1024 * 5];
		int len;
		while ((len = input.read(b)) != -1) {
		output.write(b, 0, len);
		}
		output.flush();
		output.close();
		input.close();
		}
		if (temp.isDirectory()) {// 如果是子文件夹
		copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
		}
		}
		} catch (Exception e) {
		System.out.println("复制整个文件夹内容操作出错");
		e.printStackTrace();
		}

		}
}
 
