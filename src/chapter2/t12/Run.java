package chapter2.t12;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        Thread1 a=new Thread1(service);
        a.setName("A");
        a.start();
        Thread2 b=new Thread2(service);
        b.setName("B");
        b.start();
    }
}
