package chapter4.t3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void await()  {
        try{
            lock.lock();
            System.out.println("await时间为"+System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }

    public void signal(){
        try{
            lock.lock();
            System.out.println("signal时间为"+ System.currentTimeMillis());
            condition.signal();
        }
        finally {
            lock.unlock();
        }
    }


}
