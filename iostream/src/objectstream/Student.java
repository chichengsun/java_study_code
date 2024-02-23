package objectstream;


import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 2445610101951848798L;
    /*
        Serializable接口是没有抽象方法的标记型接口
        一旦实现了这个接口，那么就表示当前的Student类可以被序列化

        如果不想类中的某个属性不适用序列化，则可以在属性前加上transient关键字
    */
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
