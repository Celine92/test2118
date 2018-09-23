package chapter2.synUpdateNewValue;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.runMethod();
    }
}

