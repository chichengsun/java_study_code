package demo1;

public class Demo1 {
    public static void main(String[] args) {
        /*
        多线程的第一种启动方式：
            1.自己定义一个类继承Thread
            2.重写run方法
            3.创建子类的对象，并启动线程
         */

        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        th1.setName("线程一");
        th2.setName("线程二");
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        th1.start();
        th2.start();
    }
}
