package chapter2.setNewStringTwoLock;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }


}
