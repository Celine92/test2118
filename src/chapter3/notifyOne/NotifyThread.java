package chapter3.notifyOne;

/**
 * Created by CELINE on 2018-05-02.
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
