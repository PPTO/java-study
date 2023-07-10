package cn.itheima.lambda;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("多线程程序启动了");
    }

    public static void  aVoid(){
        System.out.println("aaa");
    }
}
