package byteandcharstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        字符输出流的细节：
            1.创建字节输出流对象
                1.参数是字符串表示的路径或者是file对象都可以
                2.如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
                3.如果文件已经存在，则会清空文件
            2.写数据
                write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
            3.释放资源
         */
        String str = "E:\\Java Code\\javaCode\\iostream\\src\\byteandcharstream\\a.txt";
        File f1 = new File(str);
        FileOutputStream fos = new FileOutputStream(f1, true);
        fos.write(50);
        fos.write(100);

        /*
        void write(int b)  一次写一个字节数据
        void write(byte[] b) 一次写一个字节数组数据
        void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
         */
        byte[] b = {97, 98, 99, 100, 101, 102};
        fos.write(b, 0, 3);
        fos.close();

        /*
        换行写：写入\r或者\n即可
        续写：新建fileoutput对象时，有一个参数append表示是否续写，默认否
         */

    }
}
