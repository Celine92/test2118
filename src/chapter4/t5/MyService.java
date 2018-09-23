package chapter4.t5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void awaitA()  {
        try{
            lock.lock();
            System.out.println("begin awaitA时间为"+System.currentTimeMillis()
            +" ThreadName="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA时间为"+System.currentTimeMillis()
            +" ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB()  {
        try{
            lock.lock();
            System.out.println("begin awaitB时间为"+System.currentTimeMillis()
                    +" ThreadName="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB时间为"+System.currentTimeMillis()
                    +" ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll(){
        try{
            lock.lock();
            System.out.println("   signalAll时间为"+System.currentTimeMillis()
            +"  ThreadName=" +Thread.currentThread().getName());
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

}
