package chapter2.t10doubleSynBlockOneTwo;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread1 extends Thread {
        private ObjectService task;
    public Thread1(ObjectService task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.serviceMethodA();
    }
}
