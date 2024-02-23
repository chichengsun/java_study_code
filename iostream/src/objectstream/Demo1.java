package objectstream;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        序列化流/对象操作输出流：可以将java中的对象写到本地文件中

        public ObjectOutputStream(OutputStrea out)  把基本流包装成高级流
        public final void writeObject(Object obj)  把对象序列化（写入）到文件中去

        注意：
            使用对象输出流将对象保存到文件中会出现NotSerializableException异常
            需要让javabean类实现Serializable借口哦
         */
        Student s = new Student("lisi", 18);
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:\\Java Code\\javaCode\\iostream\\src\\objectstream\\student.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
