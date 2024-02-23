package bufferstream;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        public BufferedInputStream(InputStream is)  把基本流包装秤高级流，提高读取数据的性能
        public BufferedOutputStream(OutputStream os)  把基本流包装乘高级流，提高写出数据的性能
         */
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("E:\\Java Code\\javaCode\\iostream\\src\\bufferstream\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("E:\\Java Code\\javaCode\\iostream\\src\\bufferstream\\a_copy.txt"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
