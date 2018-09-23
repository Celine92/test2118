package chapter3.notifyHoldLock;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait threadName="+Thread.currentThread().getName()  );
                lock.wait();
                System.out.println("end wait threadName="+Thread.currentThread().getName() );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin notify threadName="
                +Thread.currentThread().getName());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify threadName="
                +Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
