package objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:\\Java Code\\javaCode\\iostream\\src\\objectstream\\student_many.txt"));
        Student s1 = new Student("lisi", 28);
        Student s2 = new Student("zhao", 18);
        Student s3 = new Student("sun", 38);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();
    }
}
