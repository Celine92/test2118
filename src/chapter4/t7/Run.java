package chapter4.t7;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.start();
        ThreadB b=new ThreadB(service);
        b.start();

    }
}
