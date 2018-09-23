package chapter3.waitInterruptException;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println(" end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }
}
