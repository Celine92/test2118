package chapter2.t12;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Thread2 extends Thread{
    private Service task;
    public Thread2(Service task){
        super();
        this.task=task;
    }

    @Override
    public void run(){
        super.run();
        task.setUsernamePassword("b","bb");

    }
}
