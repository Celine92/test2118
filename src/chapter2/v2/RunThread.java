package chapter2.v2;

/**
 * Created by CELINE on 2018-04-25.
 */
public class RunThread extends Thread {
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    volatile private boolean isRunning=true;
    @Override
    public void run(){
        System.out.println("进入run了");
        while(isRunning==true){
        }
        System.out.println("线程被停止了");
    }
}
