package chapter3.joinSleep2;

/**
 * Created by CELINE on 2018-08-31.
 */
public class run {
    public static void main(String[] args) {
        try {
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c=new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
