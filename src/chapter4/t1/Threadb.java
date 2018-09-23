package chapter4.t1;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Threadb extends Thread {
    private MyService service;
    public Threadb(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.methodB();
    }
}
