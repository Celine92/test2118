package chapter4.t1;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA A=new ThreadA(service);
        A.setName("a");
        A.start();
        ThreadAA AA=new ThreadAA(service);
        AA.setName("aa");
        AA.start();
        Thread.sleep(100);
        Threadb B=new Threadb(service);
        B.setName("b");
        B.start();
        Threadbb BB=new Threadbb(service);
        BB.setName("bb");
        BB.start();

    }
}
