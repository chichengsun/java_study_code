package abstracts;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog("ss", 28);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.drink();
        a.eat();
    }
}
