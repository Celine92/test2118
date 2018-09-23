package chapter6.ehan;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
