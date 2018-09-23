package chapter4.t7;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            service.get();
        }
    }
}
