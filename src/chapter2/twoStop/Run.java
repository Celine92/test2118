package chapter2.twoStop;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA athread=new ThreadA(service);
        athread.start();
        ThreadB bthread=new ThreadB(service);
        bthread.start();
    }
}
