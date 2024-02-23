import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        public boolean createNewFile() 创建一个新的空的文件
        public boolean mkdir() 创建单级文件夹
        public boolean mkdirs() 创建多级文件夹
        public boolean delete() 删除文件或者空文件夹
         */

        String str = "E:\\Java Code\\javaCode\\file\\src\\demo2.txt";
        File f1 = new File(str);
        System.out.println(f1.isFile());
        System.out.println(f1.createNewFile());


    }
}
