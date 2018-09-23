package chapter4.t1;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Threadbb extends Thread {
    private MyService service;
    public Threadbb(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.methodB();
    }
}
