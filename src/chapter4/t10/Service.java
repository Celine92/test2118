package chapter4.t10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Service {
    public  ReentrantLock lock=new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
