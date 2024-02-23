package printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        打印流：
            平常使用的标准输出流System.out.println就是打印字节流，有虚拟机创建，默认指向控制台
            PrintStream打印字节流（无缓冲区，默认自动刷新）  PrintWriter打印字符流（有缓冲区，想要自动刷新需要开启）
            打印流智能操作文件目的地，不操作数据源
            特有的写出方法可以实现：数据原样写出
            例如：打印：97  文件中：97


        public PrintStream(OutputStream/File/String)  关联字节输出流、文件、文件路径
        public PrintStream(String fileName, Charset charset)  指定字符编码
        public PrintStream(OutputStream out, boolean autoFlush)  自动刷新
        public PrintStream(OutputStream out, boolean autoFlush, String encoding/Charset charset)  指定字符编码且自动刷新

        public void write(int b)  常规方法：规则跟之前一样，将指定的字节写出
        public void println(Xxx, xxx)  特有方法：打印任意数据，自动刷新，自动换行
        public void print(Xxx, xxx)  特有方法：打印任意数据，不换行
        public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
         */

        PrintStream ps = new PrintStream(
                new FileOutputStream("E:\\Java Code\\javaCode\\iostream\\src\\printstream\\a.txt", true));
        ps.println(97);
        ps.println("wish");
        ps.println("凡人修仙传");
        ps.close();
    }
}
