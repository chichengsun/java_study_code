import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname) 根据文件路径创建文件对象
        public File(String parent, String child) 根据父路径字符串和子路径字符串创建文件对象
        public File(File parent, String child) 根据父路径对应文件对象和子路径名字字符串创建文件对象
         */

        String str = "E:\\Java Code\\javaCode\\file\\src\\text.txt";
        File file1 = new File(str);
        System.out.println(file1);

        String parent = "E:\\Java Code\\javaCode\\file\\src";
        String child = "text.txt";
        File file2 = new File(parent, child);
        System.out.println(file2);

        File file3 = new File(parent);
        File file4 = new File(file3, child);
        System.out.println(file4);
    }
}
