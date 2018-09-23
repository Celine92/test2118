package chapter6.t1;

/**
 * Created by CELINE on 2018-05-07.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
