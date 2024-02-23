package threadpool.demo1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
        /*
        public static ExecutorService newCachedThreadPool()  创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool(int nThreads)  创建有上限的线程池
         */
        //获取线程池对象
        ExecutorService pool = Executors.newCachedThreadPool();
        //像线程池中添加任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        //关闭线程池
        pool.shutdown();
    }
}
