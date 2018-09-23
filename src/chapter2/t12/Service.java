package chapter2.t12;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Service {
   private String usernameParam;
   private String passwordParam;
   //private String anyString=new String();  对于下边的synchronized (anyString)来说是同一个对象
   public void setUsernamePassword(String username,String password){
       try {
           String anyString=new String();//对于下边的synchronized (anyString)来说是不是同一个对象
           synchronized (anyString){
               System.out.println("线程名称为："+Thread.currentThread().getName()
               +" 在 "+System.currentTimeMillis()+" 进入同步块");
               usernameParam=username;
               Thread.sleep(3000);
               passwordParam=password;
               System.out.println("线程名称为："+Thread.currentThread().getName()
                       +" 在 "+System.currentTimeMillis()+" 离开同步块");
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
