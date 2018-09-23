package chapter2.setNewPropertiesLockOne;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo){
        synchronized (userInfo){
            try{
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("celine");
                Thread.sleep(3000);
                System.out.println("end! Time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
