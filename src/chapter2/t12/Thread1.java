package chapter2.t12;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread1 extends Thread {
    private Service task;
    public Thread1(Service task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.setUsernamePassword("a","aa");

    }
}
