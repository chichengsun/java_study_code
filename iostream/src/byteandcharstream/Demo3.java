package byteandcharstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\chich\\Videos\\街头弹唱_《开始懂了》我被孙燕姿回复啦!!!!!!.开始懂了2.410452280.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\Java Code\\javaCode\\iostream\\src\\byteandcharstream\\test.mp4");
        byte[] b = new byte[1024 * 1024 * 5];
        int len = -1;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();
    }
}
