package chapter2.t9;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread2 extends Thread{
    private Task task;
    public Thread2(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        CommonUtils.BeginTime2=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2=System.currentTimeMillis();
    }
}
