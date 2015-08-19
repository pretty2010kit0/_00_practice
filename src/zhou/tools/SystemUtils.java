package zhou.tools;

import java.nio.charset.Charset;

import org.junit.Test;

public class SystemUtils {

	// 在当前的java虚拟机中获取默认的字符集
	// java语言的字符编码格式为"UTF-16"
	@Test
	public void getDefaultCharset(){
		String charset = Charset.defaultCharset().displayName();
		System.out.println(charset);
	}
}
