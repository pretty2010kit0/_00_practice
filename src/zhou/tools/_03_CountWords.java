package zhou.tools;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
/**
 * 统计小说里用到的字的总数 
 * */
public class _03_CountWords {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("/home/tarena/与神对话1.txt");
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        /* int   available() 
         * 返回下一次对此输入流调用的方法可以不受
         * 阻塞地从此输入流读取（或跳过）的估计剩
         * 余字节数。
         * */
        byte[] buf = new byte[in.available()];
        in.read(buf);
        String str = new String(buf,"UTF-8");
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, 1);
        }
        System.out.println("小说里用到的字共有：\n"+map.size()+"个");
    }
}
