package chapter2.t5;

/**
 * Created by CELINE on 2018-04-24.
 */
public class MyObject {
   synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName= " + Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end end time="+System.currentTimeMillis());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
       try {
           System.out.println("begin methodB threadName= "+Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
           Thread.sleep(5000);
           System.out.println("end end time="+System.currentTimeMillis());
       }catch (InterruptedException e)
       {
           e.printStackTrace();
       }
    }
}
