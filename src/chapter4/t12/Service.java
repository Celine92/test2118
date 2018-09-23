package chapter4.t12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Service {
    public  ReentrantLock lock=new ReentrantLock();
    public Condition newCondition=lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notityMethod(){
        try{
            lock.lock();
            System.out.println("有没有线程在等待newCondition?"
            +lock.hasWaiters(newCondition)+" 线程数是多少？"
            +lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
