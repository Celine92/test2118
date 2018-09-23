package chapter2.t4;

/**
 * Created by CELINE on 2018-04-24.
 */
public class MyObject {
   synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName= " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
