package chapter4.t15;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyThread extends Thread {
    private Service service;
    public MyThread(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}
