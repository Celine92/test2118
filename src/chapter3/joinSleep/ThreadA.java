package chapter3.joinSleep;

/**
 * Created by CELINE on 2018-08-31.
 */
public class ThreadA  extends Thread{
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }
    @Override
    public void run(){
        synchronized (b){
            b.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
