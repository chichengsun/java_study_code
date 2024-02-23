package byteandcharstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        String str = "E:\\Java Code\\javaCode\\iostream\\src\\byteandcharstream\\b.txt";
        File f1 = new File(str);
        FileWriter fw = new FileWriter(f1, true);

        fw.write(25105);
        fw.write("你好\n");
        fw.write("研究生！\n");
        fw.write("布拉布拉\n", 0, 5);
        char[] chars = {'a', 'b', '王'};
        fw.write(chars);


        fw.close();
    }
}
