package chapter2.t9test;

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
        CommonUtils.beginTime1=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1=System.currentTimeMillis();
    }
}
