package chapter3.notifyHoldLock;

/**
 * Created by CELINE on 2018-04-26.
 */
public class synNotifyMethodThread extends Thread {
    private Object lock;
    public synNotifyMethodThread(Object lock){
        this.lock=lock;
    }
    @Override
    public void run(){
        Service service=new Service();
        service.synNotifyMethod(lock);
    }
}
