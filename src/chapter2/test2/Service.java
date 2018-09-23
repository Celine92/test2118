package chapter2.test2;


/**
 * Created by CELINE on 2018-04-24.
 */
public class Service {
  public void testMethod1(MyObject object){
      synchronized (object){
          try{
              System.out.println("testMethod1-----getLock Time="+System.currentTimeMillis()+" run ThreadName="
              +Thread.currentThread().getName());
              Thread.sleep(5000);
              System.out.println("testMethod1-----releaseLock Time="+System.currentTimeMillis()+" run ThreadName="
                      +Thread.currentThread().getName());
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}
