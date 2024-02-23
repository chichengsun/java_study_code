package extend.demo1;

public class Student extends Person {
    public Student() {
        System.out.println("调用Student类无参构造！");
    }
    public Student(String name, int age) {
        super(name, age);
        System.out.println("调用Student有参构造！");
    }
    public String toString() {
        return "{name: " + this.name + ", " + "age: " + this.age + "}";
    }
}
