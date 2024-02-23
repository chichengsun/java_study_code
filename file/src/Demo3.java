import java.io.File;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        /*
        public File[] listFiles()  获取当前该路径下所有内容
        当调用者file表示的路径不存在时，返回null
        当调用者file表示的路径是文件时，返回null
        当调用者file表示的路径是一个空文件夹时，返回一个长度为0的数组
        当调用者表示的路径是一个有内容的文件夹时，将里面所有的文件和文件夹的路径放在file数组中返回
        当调用者file表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在file数组中返回，包含隐藏文件
        当调用者file表示的路径是需要权限才能访问的文件夹时，返回null
         */
        String str = "E:\\Java Code\\javaCode\\file\\src\\demo";
        File f1 = new File(str);
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);
        System.out.println(f1);

        File[] files = f1.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
