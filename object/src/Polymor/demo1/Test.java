package Polymor.demo1;

public class Test {
    public static void main(String[] args) {
        /*
        成员变量：编译看左边，运行看左边
        成员方法：编译看左边，运行看右边
         */
        Animal d = new Dog();
        System.out.println(d.name);
        d.show();

        if (d instanceof Dog D) {
            D.lookHome();
        }
    }
}
/*
final:
修饰类方法，表示该方法不能被重写
修饰类，表示该类不能被继承
修饰变量，
    如果修饰的为基本类型，表示变量只能在初始化的时候被赋值，之后不能改变值
    如果修饰的为引用类型，表示变量的地址值不能改变，而对象内部的值可以改变
 */