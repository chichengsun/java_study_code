package base_function;

public class Demo1 {
    public static void main(String[] args) {
        /*
        String getName()  返回此线程的名称
        void setName(String name)  设置线程的名字（构造方法也可以设置名字）
            注意：
                如果没有设置名称，则使用默认名称Thread-X
                如果通过构造函数设置名字，则需要调用Thread的构造方法
        static Thread currentThread()  获取当前线程的对象
        static void sleep(long time)  让线程休眠指定的时间，单位为毫秒
        setPriority(int newPriority)  设置线程的优先级
        final int getPriority()  获取线程的优先级
            注意：
                java当中使用的调度策略是 抢占式调度（通俗一点就是随机调度）
                优先级分为十档 默认是5，最小是1，最大是10
                由于是抢占式调度 所以优先级不一定决定线程执行的速度
        final void setDaemon(boolean on)  设置为守护线程
            注意：
                当其他的非守护线程执行完毕时，不管守护线程有没有执行完，守护线程会陆续结束
        public static void yield()  出让线程 礼让线程
        public static void join()  插入线程 插队线程
         */
    }
}
