package chapter3.joinMoreTest;



/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }
    @Override
    public void run(){
        try{
            System.out.println("begin A threadName="
            +Thread.currentThread().getName()+" "
                    +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end A threadName="+
                    Thread.currentThread().getName()+" "
            +System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
