package chapter2.t11;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Task {
    synchronized public void otherMothod(){
       System.out.println("-----------------------run--otherMethod");
   }
   public void doLongTimeTask(){
       synchronized (this){
           for(int i=0;i<10000;i++){
               System.out.println("synchronized threadName="
               +Thread.currentThread().getName()+" i=" +(i+1));
           }
       }
   }

}
