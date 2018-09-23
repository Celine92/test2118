package chapter2.twoStop;



/**
 * Created by CELINE on 2018-04-25.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.methodA();
    }
}
