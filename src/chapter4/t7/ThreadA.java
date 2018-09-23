package chapter4.t7;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run(){

        for(int i=0;i<Integer.MAX_VALUE;i++){
            service.set();
        }
    }
}
