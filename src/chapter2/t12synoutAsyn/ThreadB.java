package chapter2.t12synoutAsyn;

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

        for(int i=0;i<100000;i++){
            service.add("threadB"+(i+1));
        }
    }
}
