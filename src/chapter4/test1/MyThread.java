package chapter4.test1;

/**
 * Created by CELINE on 2018-08-31.
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
