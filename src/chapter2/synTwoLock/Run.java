package chapter2.synTwoLock;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
       Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        Service service1=new Service();
        ThreadB b=new ThreadB(service1);
        b.setName("B");
        b.start();
        ThreadC c=new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
