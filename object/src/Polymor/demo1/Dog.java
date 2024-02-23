package Polymor.demo1;

public class Dog extends Animal{
    String name = "Dog!";

    @Override
    public void show() {
        System.out.println("我是一只狗！");
    }

    public void lookHome() {
        System.out.println("看家！");
    }
}
