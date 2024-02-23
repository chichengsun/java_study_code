package demo2;

public class Demo1 {
    public static void main(String[] args) {
        /*
        多线程的第二种启动方法：
            1.自己定义个类实现Runnable接口
            2.重写run方法
            3.创建自己的类的对象
            4.创建一个Thread类的对象，并开启线程
         */
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
