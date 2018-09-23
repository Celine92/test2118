package chapter1.myThread;

/**
 * Created by CELINE on 2018-04-19.
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("----begin----");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("This.getName()="+this.getName());
        System.out.println("-----end-----");
    }
    @Override
    public void run(){
        System.out.println("run----begin----");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("This.getName()="+this.getName());
        System.out.println("run-----end-----");
    }
}
