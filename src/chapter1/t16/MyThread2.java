package chapter1.t16;

/**
 * Created by CELINE on 2018-04-24.
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("2 run priority=" +this.getPriority());
    }
}
