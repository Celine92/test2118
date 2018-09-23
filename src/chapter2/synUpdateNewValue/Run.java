package chapter2.synUpdateNewValue;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
       Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.start();
        Thread.sleep(1000);
        ThreadB b=new ThreadB(service);
        b.start();
        System.out.println("已经发起挺值得命令了");

    }
}
