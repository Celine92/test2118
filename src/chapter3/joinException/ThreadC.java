package chapter3.joinException;

/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB=threadB;
    }
    @Override
    public void run(){
      threadB.interrupt();
    }
}
