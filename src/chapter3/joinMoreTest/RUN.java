package chapter3.joinMoreTest;

/**
 * Created by CELINE on 2018-05-03.
 */
public class RUN {
    public static void main(String[] args) {
        try{
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("      main end "
            +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
