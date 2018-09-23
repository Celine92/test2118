package chapter2.twoStop;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Service {
    Object object1=new Object();
     public void methodA(){
         synchronized (object1){
             System.out.println("methodA begin");
             boolean isContinueRun=true;
             while(isContinueRun){
             }
             System.out.println("methodA end");
         }
     }
    Object object2=new Object();
      public void methodB(){
          synchronized(object2){

              System.out.println("methodB begin");
              System.out.println("methodB end");
          }
      }
}
