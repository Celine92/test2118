package chapter4.t15;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service=new Service();
            MyThread t=new MyThread(service);
            t.start();
            MyThread.sleep(3000);
            MyThread.interrupted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
