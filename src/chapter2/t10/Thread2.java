package chapter2.t10;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread2 extends Thread{
    private myTask task;
    public Thread2(myTask task){
        super();
        this.task=task;

    }

    @Override
    public void run(){
        super.run();
        task.doLongTimeTask();
    }
}
