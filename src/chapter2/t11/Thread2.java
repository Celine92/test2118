package chapter2.t11;

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
        task.otherMothod();
    }
}
