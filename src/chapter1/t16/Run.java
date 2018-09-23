package chapter1.t16;


/**
 * Created by CELINE on 2018-04-23.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" +Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" +Thread.currentThread().getPriority());
        MyThread thread=new MyThread();
        thread.start();

    }
}


