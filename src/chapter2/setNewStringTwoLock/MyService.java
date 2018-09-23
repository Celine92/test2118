package chapter2.setNewStringTwoLock;

import chapter2.twoStop.ThreadB;

/**
 * Created by CELINE on 2018-04-25.
 */
public class MyService {
    private String lock="123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin"+
                System.currentTimeMillis()+" "+lock);
                lock="456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end"+System.currentTimeMillis()+" " +lock);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
