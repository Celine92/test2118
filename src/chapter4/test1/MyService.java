package chapter4.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-08-31.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod() {
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName=" +Thread.currentThread().getName()+
            " "+(i+1));
        }
        lock.unlock();
    }
}
