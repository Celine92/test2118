package chapter7.t1;

/**
 * Created by CELINE on 2018-05-07.
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法中的状态："+Thread.currentThread().getState());
    }

    @Override
    public void run(){
        System.out.println("run方法的状态："+Thread.currentThread().getState());
    }
}
