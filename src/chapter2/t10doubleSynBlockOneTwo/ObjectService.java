package chapter2.t10doubleSynBlockOneTwo;


/**
 * Created by CELINE on 2018-04-24.
 */
public class ObjectService {
    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println("A begin time=" +System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end endtime="+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end endtime= "+System.currentTimeMillis());
        }
    }
}
