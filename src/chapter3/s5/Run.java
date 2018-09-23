package chapter3.s5;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadA a=new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b=new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
