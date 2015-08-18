package zhou.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/**解压文件*/
public class _02_MyMultipleUnZipFiles {
    public static void main(String[] args) {
       try {
           unZipFiles(new File("/home/tarena/workspace5320.zip"));
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
    public static void unZipFiles(File zipFile)throws IOException{
        //得到压缩文件所在目录
        String path = zipFile.getAbsolutePath();
//        System.out.println("源文件位置："+path);
        path = path.substring(0, path.lastIndexOf("/"));
//        System.out.println("源文件所在目录"+path);
        ZipFile zip = new ZipFile(zipFile);    
        for(Enumeration<?> entries = zip.entries();entries.hasMoreElements();){
            ZipEntry entry =(ZipEntry) entries.nextElement();
            String ZipEntryName = entry.getName();
            InputStream in = zip.getInputStream(entry);
            //输出目录
            String outPath = path+"/"+ZipEntryName;
//            System.out.println("outPath:"+outPath);
//            System.out.println("ZipEntryName:"+ZipEntryName);
            //判断路径是否存在，不存在则创建文件路径
            File file = new File(outPath.substring(0,outPath.lastIndexOf('/')));
            if (!file.exists()) {
                file.mkdirs();
            }
            //判断文件全路径是否为文件夹，如果是上面已经上传，不需要解压
            if (new File(outPath).isDirectory()) {
                continue;
            }
            //输出文件路径信息
//            System.out.println(outPath);
            OutputStream out = new FileOutputStream(outPath);
            byte[] buf = new byte[8*1024];
            int len=0;
            while((len=in.read(buf))!=-1){
                out.write(buf,0,len);
            }
            in.close();
            out.close();
        }
        System.out.println("*******" +
                "解压完毕*******");
    }
}
/**
 * public class ZipFile
 * extends Object
 * 此类用于从 ZIP 文件读取条目。
 * 除非另有说明，将 null 参数传入此类中的构造方法或方法将导致抛出 NullPointerException。 
 * 
 * public class ZipEntry
 * extends Object
 * implements Cloneable
 * 此类用于表示 ZIP 文件条目。 
 * 
 * public interface Enumeration<E>
 * 实现 Enumeration 接口的对象，它生成一系列元素，一次生成一个。连续调用 nextElement 
 * 方法将返回一系列的连续元素。
 * 例如，要输出 Vector<E> v 的所有元素，可使用以下方法：
 *    for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
 *        System.out.println(e.nextElement());
 * 这些方法主要通过向量的元素、哈希表的键以及哈希表中的值进行枚举。枚举也用于将输入流指定到 
 * SequenceInputStream 中。
 * 注：此接口的功能与 Iterator 接口的功能是重复的。此外，Iterator 接口添加了一个可选的移除
 * 操作，并使用较短的方法名。新的实现应该优先考虑使用 Iterator 接口而不是 Enumeration 接口。 
 * */




