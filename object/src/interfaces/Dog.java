package interfaces;

public class Dog extends Animal implements Swim, ToString{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头！");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨！");
    }

    @Override
    public String toString() {
        return "{name: " + this.getName() + ", age: " + this.getAge() + "}";
    }
}
