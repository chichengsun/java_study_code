package shrinkstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("E:\\Java Code\\javaCode\\iostream\\src\\shrinkstream\\aaa.zip");
        File dest = new File("E:\\Java Code\\javaCode\\iostream\\src\\shrinkstream");
        readZip(src, dest);

        
    }

    public static void readZip(File src, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                boolean mkdirs = file.mkdirs();
            }else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
