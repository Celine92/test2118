package chapter2.t12synBlockString2;

/**
 * Created by CELINE on 2018-04-25.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.b();
    }
}
