package chapter3.joinException;

/**
 * Created by CELINE on 2018-05-03.
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b=new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c=new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
