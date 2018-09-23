package chapter2.t11;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread1 extends Thread {
    private Task task;
    public Thread1(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }
}
