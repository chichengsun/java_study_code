package transformstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
         */
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                "E:\\Java Code\\javaCode\\iostream\\src\\transformstream\\b_utf8.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
