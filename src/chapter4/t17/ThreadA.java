package chapter4.t17;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.write();
    }
}
