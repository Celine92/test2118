package chapter2.t11;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Task task = new Task();
            Thread1 thread1 = new Thread1(task);
            thread1.start();
            Thread.sleep(100);
            Thread2 thread2 = new Thread2(task);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
