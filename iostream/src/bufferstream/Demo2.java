package bufferstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        public BufferedReader(Reader r)  把基本流变成高级流
        public BufferedWriter(Writer r)  把基本流变成高级流

        字符缓冲流特有的方法：
            public String readLine()  读取一行数据，如果没有数据可读了，会返回null；注意不会读取每一行最后的换行符
            public void newLine()  跨平台的换行
         */
        BufferedReader br = new BufferedReader(
                new FileReader("E:\\Java Code\\javaCode\\iostream\\src\\bufferstream\\a.txt"));
        String string;
        while ((string = br.readLine()) != null) {
            System.out.println(string);
        }
//        String str = br.readLine();
//        System.out.println(str);
        br.close();
    }
}
