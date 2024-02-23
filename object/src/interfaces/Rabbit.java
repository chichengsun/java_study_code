package interfaces;

public class Rabbit extends Animal implements ToString{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜！");
    }

    @Override
    public String toString() {
        return "{name: " + this.getName() + ", age: " + this.getAge() + "}";
    }
}
