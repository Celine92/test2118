package chapter6.ehan;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
