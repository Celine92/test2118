package chapter3.notifyOne;


/**
 * Created by CELINE on 2018-04-26.
 */
public class ThreadC extends Thread {
    private Object lock;
    public ThreadC(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public void run(){
        Service service=new Service();
        service.testMethod(lock);
    }

}
