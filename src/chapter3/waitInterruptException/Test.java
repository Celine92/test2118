package chapter3.waitInterruptException;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
