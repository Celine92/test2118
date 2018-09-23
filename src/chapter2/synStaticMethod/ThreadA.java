package chapter2.synStaticMethod;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {

    @Override
    public void run(){
        Service.printA();
    }
}

