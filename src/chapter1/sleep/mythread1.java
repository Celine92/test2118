package chapter1.sleep;


/**
 * Created by CELINE on 2018-08-30.
 */
public class mythread1 extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("run threadName="+this.currentThread().getName()+" begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
