package chapter4.t1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public void methodA()  {
        try{
        lock.lock();
        System.out.println("methodA begin ThreadName="
        +Thread.currentThread().getName()+" time="
        +System.currentTimeMillis());
        Thread.sleep(5000);
            System.out.println("methodA end ThreadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
        lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB()  {
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
