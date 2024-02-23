package byteandcharstream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        String str = "E:\\Java Code\\javaCode\\iostream\\src\\byteandcharstream\\b.txt";
        File f1 = new File(str);
        FileReader fr = new FileReader(f1);

//        int chr;
//        while ((chr = fr.read()) != -1) {
//            System.out.print((char) chr);
//        }
        char[] chars = new char[5];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        fr.close();
    }
}
