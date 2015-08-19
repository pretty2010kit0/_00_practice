<<<<<<< HEAD
package test;

import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class TestRandomAccessFile {  
    public static void main(String[] args) throws IOException {  
        RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");  
        for (int i = 0; i < 10; i++) {  
            //写入基本类型double数据  
            rf.writeDouble(i * 1.414);  
        }  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "rw");  
        //直接将文件指针移到第5个double数据后面  
        rf.seek(5 * 8);  
        //覆盖第6个double数据  
        rf.writeDouble(47.0001);  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "r");  
        for (int i = 0; i < 10; i++) {  
            System.out.println("Value " + i + ": " + rf.readDouble());  
        }  
        rf.close();  
    }  
=======
package test;

import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class TestRandomAccessFile {  
    public static void main(String[] args) throws IOException {  
        RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");  
        for (int i = 0; i < 10; i++) {  
            //写入基本类型double数据  
            rf.writeDouble(i * 1.414);  
        }  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "rw");  
        //直接将文件指针移到第5个double数据后面  
        rf.seek(5 * 8);  
        //覆盖第6个double数据  
        rf.writeDouble(47.0001);  
        rf.close();  
        rf = new RandomAccessFile("rtest.dat", "r");  
        for (int i = 0; i < 10; i++) {  
            System.out.println("Value " + i + ": " + rf.readDouble());  
        }  
        rf.close();  
    }  
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
}  