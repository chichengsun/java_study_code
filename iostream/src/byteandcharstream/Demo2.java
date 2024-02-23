package byteandcharstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String str = "E:\\Java Code\\javaCode\\iostream\\src\\byteandcharstream\\a.txt";
        File f1 = new File(str);
        FileInputStream fis = new FileInputStream(f1);
        //文件不存在，直接报错
//        int read = fis.read();
//        // read函数一次读一个字符，当读完时，再进行读，则返回-1
//        System.out.println((char) read);
//        int read2 = fis.read();
//        System.out.println((char) read2);

//        int b = -1;
//        while((b = fis.read()) != -1) {
//            System.out.println((char) b);
//        }

        /*
        read函数可以读多个字节数据
         */
        byte[] b = new byte[3];
        int len = 0;
        while ((len = fis.read(b)) != -1) {
            // 方法返回读到的字节个数
            String string = new String(b, 0, len);
            System.out.println(len);
            System.out.println(string);
        }

        fis.close();
    }
}
