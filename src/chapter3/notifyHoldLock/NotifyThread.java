package chapter3.notifyHoldLock;

/**
 * Created by CELINE on 2018-04-26.
 */
public class NotifyThread extends  Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public void run(){
        Service service=new Service();
        service.synNotifyMethod(lock);
    }
}
