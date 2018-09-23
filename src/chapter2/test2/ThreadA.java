package chapter2.test2;

/**
 * Created by CELINE on 2018-04-25.
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;
    public ThreadA(Service service, MyObject object){
        super();
        this.service=service;
        this.object=object;
    }
    @Override
    public void run(){
        service.testMethod1(object);
    }
}
