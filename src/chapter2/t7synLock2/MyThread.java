package chapter2.t7synLock2;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        Sub sub=new Sub();
        sub.operateISubMethod();
    }
}
