package chapter2.StringAndSyn;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Service {
     public  void print(Object object){
        try{
            synchronized (object){
               while(true){
                   System.out.println(Thread.currentThread().getName());
                   Thread.sleep(1000);
               }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
