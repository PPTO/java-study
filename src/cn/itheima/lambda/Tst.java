package cn.itheima.lambda;

@FunctionalInterface
public interface Tst {
    int a = 1;

    default int a(){
    return 1 + a;
    }


    int add(int x , int y);



}
