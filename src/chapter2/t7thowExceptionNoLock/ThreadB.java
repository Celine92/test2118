package chapter2.t7thowExceptionNoLock;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        super.run();
        service.testMethod();
    }
}
