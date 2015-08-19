package html_request;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//网络获取Html代码
public class HtmlRequest {
        /**
         * @param args
         * @throws MalformedURLException 
         */
        public static void main(String[] args) throws Exception
        {
            URL url = new URL("http://code.jquery.com/jquery-latest.js"); 
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            InputStream inStream =  conn.getInputStream();//通过输入流获取html数据   
            byte[] data = readInputStream(inStream);//得到html的二进制数据
            String html = new String(data);
            System.out.println(html);
        }
       public static byte[] readInputStream(InputStream instream) throws Exception
        {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            byte[]  buffer = new byte[1204];
            int len = 0;
            while ((len = instream.read(buffer)) != -1)
            {
                outStream.write(buffer,0,len);
            }
            instream.close();
            return outStream.toByteArray();         
        }

    }