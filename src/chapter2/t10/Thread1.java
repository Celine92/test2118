package chapter2.t10;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread1 extends Thread {
    private myTask task;
    public Thread1(myTask task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }
}
