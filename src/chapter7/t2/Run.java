package chapter7.t2;

/**
 * Created by CELINE on 2018-05-07.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
