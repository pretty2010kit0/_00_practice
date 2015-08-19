package zhou.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.junit.Test;

public class UTF8$GBK {
    @Test
    public void GBK_UTF8() throws Exception{
        BufferedReader in = 
            new BufferedReader(
             new InputStreamReader(
              new BufferedInputStream(
               new FileInputStream("day06.txt")),"GBK"));
      //这里设置true，打开了AutoFlush(遇见回车就刷新缓冲区)
        PrintWriter out = new PrintWriter(
          new OutputStreamWriter(
            new BufferedOutputStream(
              new FileOutputStream("day06_test.txt")),"UTF-8"),true);
        String s;
        while((s=in.readLine())!=null){
            //s 是文件中每一行文本
            //以GBK读入，UTF-8写出
            out.println(s);
        }
        in.close();
        out.close();
        System.out.println("文件转码完毕！");
    }
    @Test
    public void UTF8_GBK() throws Exception{
        BufferedReader in = 
            new BufferedReader(
             new InputStreamReader(
              new BufferedInputStream(
               new FileInputStream("day06_test.txt")),"UTF-8"));
      //这里设置true，打开了AutoFlush(遇见回车就刷新缓冲区)
        PrintWriter out = new PrintWriter("day06_test1.txt","GBK");
        String s;
        while((s=in.readLine())!=null){
            //s 是文件中每一行文本
            //以GBK读入，UTF-8写出
            out.println(s);
        }
        in.close();
        out.close();
        System.out.println("文件转码完毕！");
    }
}
