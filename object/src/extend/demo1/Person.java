package extend.demo1;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("调用Person无参构造！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用Person有参构造！");
    }
}
