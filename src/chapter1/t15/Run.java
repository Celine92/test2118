package chapter1.t15;


/**
 * Created by CELINE on 2018-04-23.
 */
public class Run {
    public static void main(String[] args) {

            MyThread thread = new MyThread();
            thread.start();
            thread.interrupt();
            System.out.println("end!");

    }
}


