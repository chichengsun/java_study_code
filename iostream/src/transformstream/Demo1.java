package transformstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(
                "E:\\Java Code\\javaCode\\iostream\\src\\transformstream\\a.txt"
                , Charset.forName("GBK"));
        int chr;
        while ((chr = fr.read()) != -1) {
            System.out.println((char) chr);
        }
        fr.close();
    }
}
