package chapter2.t7synLock1;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        Service service=new Service();
        service.service1();


    }
}
