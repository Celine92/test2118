package chapter2.t10doubleSynBlockOneTwo;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread2 extends Thread{
    private ObjectService task;
    public Thread2(ObjectService task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.serviceMethodB();
    }
}
