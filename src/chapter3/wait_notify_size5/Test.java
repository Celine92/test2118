package chapter3.wait_notify_size5;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object service=new Object();
        ThreadA a=new ThreadA(service);
        a.start();
        Thread.sleep(50);
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
