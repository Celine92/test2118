package chapter2.v3;

/**
 * Created by CELINE on 2018-04-25.
 */
public class MyThread extends Thread {
     public static int count;
    synchronized private static void addCount(){
        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run(){
        addCount();
    }
}
