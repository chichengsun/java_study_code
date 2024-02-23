package objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        反序列化流/对象操作输入流：可以把序列化到本地文件中的对象，读取到程序中

        public ObjectInputStream(InputStream out)  把基本流变成高级流
        public Object readObject()  把序列化到本地文件中的对象，读取到程序中来
         */

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("E:\\Java Code\\javaCode\\iostream\\src\\objectstream\\student.txt"));
        Object o = ois.readObject();
        if (o instanceof Student s) {
            System.out.println(s);
        }
        ois.close();
    }
}
