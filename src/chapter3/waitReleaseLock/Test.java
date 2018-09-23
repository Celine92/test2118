package chapter3.waitReleaseLock;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        ThreadB b=new ThreadB(lock);
        b.start();
    }
}
