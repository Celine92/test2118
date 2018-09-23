package chapter4.t4;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA A=new ThreadA(service);
        A.start();
        Thread.sleep(3000);
        service.signal();

    }
}
