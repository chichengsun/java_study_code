package printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        public PrintWriter(Writer/File/String)  关联字符输出流
        public PrintWriter(String fileName, Charset charset)  指定字符编码
        public PrintWriter(writer w, boolean autoFlush)  自动刷新
        public PrintWriter(OutputStream out, boolean autoFlush, Charset charset)  指定字符编码且自动刷新

        public void write(int b)  常规方法：规则跟之前一样，将指定的字节写出
        public void println(Xxx, xxx)  特有方法：打印任意数据，自动换行
        public void print(Xxx, xxx)  特有方法：打印任意数据，不换行
        public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
         */

        PrintWriter pw = new PrintWriter(
                new FileWriter("E:\\Java Code\\javaCode\\iostream\\src\\printstream\\a.txt", true), true);
        pw.println("你好");
        pw.close();
    }
}
