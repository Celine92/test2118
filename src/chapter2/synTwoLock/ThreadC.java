package chapter2.synTwoLock;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        Service.printC();
    }
}
