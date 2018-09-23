package chapter4.t1;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.methodA();
    }
}
