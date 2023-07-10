package cn.itheima.lambda;

import cn.itheima.lambda.MyRunnable;
import cn.itheima.lambda.Tst;


public class application {
    public static void main(String[] args) {

        new Thread(new MyRunnable()).run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动");
            }
        }).run();

        new Thread(() -> System.out.println("多线程程序启动")).start();

//        Runnable a = () -> System.out.println("123");

        Tst tst = (x, y) -> x + y + Tst.a ;
        int add = tst.add(1, 2);
        System.out.println(add);
    }


}
