package transformstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        将GBK编码的文件转成utf-8格式的文件
         */
        // java11之前的方式，使用转换流操作
        //之后采用下面的方式
        FileReader fr = new FileReader(
                "E:\\Java Code\\javaCode\\iostream\\src\\transformstream\\b_gbk.txt"
                , Charset.forName("GBK"));
        FileWriter fw = new FileWriter(
                "E:\\Java Code\\javaCode\\iostream\\src\\transformstream\\b_utf8.txt");
        int chr;
        while ((chr = fr.read()) != -1) {
            fw.write(chr);
        }
        fw.close();
        fr.close();
    }
}
