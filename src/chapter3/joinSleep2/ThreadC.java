package chapter3.joinSleep2;

/**
 * Created by CELINE on 2018-08-31.
 */
public class ThreadC extends Thread {
    private ThreadB threadb;
    public ThreadC(ThreadB threadb){
        super();
        this.threadb=threadb;
    }

    @Override
    public void run(){
        threadb.bService();
    }
}
