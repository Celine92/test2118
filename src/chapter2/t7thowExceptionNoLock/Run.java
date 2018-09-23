package chapter2.t7thowExceptionNoLock;

/**
 * Created by CELINE on 2018-04-24.
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            ThreadA a=new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b=new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
