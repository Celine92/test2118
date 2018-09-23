package chapter2.t8synNotExtends;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Main {
   synchronized public void serviceMethod(){
       try {
           System.out.println("int main 下一步 sleep begin threadName="
           +Thread.currentThread().getName()+" time="+
           System.currentTimeMillis());
           Thread.sleep(500);
           System.out.println("int main 下一步 sleep end threadName="
                   +Thread.currentThread().getName()+" time="+
                   System.currentTimeMillis());
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
