package shrinkstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File src = new File("E:\\Java Code\\javaCode\\iostream\\src\\shrinkstream\\aaa");
        File destParent = src.getParentFile();
        File dest = new File(destParent, "bbb.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        toZip(src, zos, src.getName());
        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        assert files != null: "文件夹为空";
        for (File file : files) {
            System.out.println(file);
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
