package chapter2.t12synBlockString2;

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
        service.a();
    }
}
