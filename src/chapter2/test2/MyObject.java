package chapter2.test2;

/**
 * Created by CELINE on 2018-04-25.
 */
public class MyObject {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString----getLock time="
        +System.currentTimeMillis()+"run ThreadName="
        +Thread.currentThread().getName());
        System.out.println("---------------");
        System.out.println("speedPrintString----releaseLock time="
                +System.currentTimeMillis()+"run ThreadName="
                +Thread.currentThread().getName());
    }
}
