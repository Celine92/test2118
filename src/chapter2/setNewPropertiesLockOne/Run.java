package chapter2.setNewPropertiesLockOne;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service=new Service();
            UserInfo userInfo=new UserInfo();
            ThreadA a=new ThreadA(service,userInfo);
            a.setName("a");
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(service,userInfo);
            b.setName("b");
            b.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
