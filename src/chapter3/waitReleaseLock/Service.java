package chapter3.waitReleaseLock;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                Thread.sleep(40000);
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
