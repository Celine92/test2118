package chapter1.t16;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        System.out.println("mythread run priority="+this.getPriority());
        MyThread2 mythread2=new MyThread2();
        mythread2.start();


    }
}
