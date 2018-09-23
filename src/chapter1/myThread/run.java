package chapter1.myThread;

/**
 * Created by CELINE on 2018-04-19.
 */
public class run {
    public static void main(String[] args) {
        CurrentOperate c = new CurrentOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());

    }
}
