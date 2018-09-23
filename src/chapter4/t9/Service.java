package chapter4.t9;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()
            +"获得锁定");
        }finally{
            lock.unlock();
        }
    }
}
