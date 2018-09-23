package chapter2.synStaticMethod;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadB extends Thread {
    @Override
    public void run(){
        Service.printB();
    }
}
