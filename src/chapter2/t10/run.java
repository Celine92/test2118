package chapter2.t10;

/**
 * Created by CELINE on 2018-04-24.
 */
public class run {
    public static void main(String[] args) {
        myTask myTask=new myTask();
        Thread1 thread1=new Thread1(myTask);
        thread1.start();
        Thread2 thread2=new Thread2(myTask);
        thread2.start();
    }
}
