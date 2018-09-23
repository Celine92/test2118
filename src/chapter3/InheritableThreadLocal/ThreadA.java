package chapter3.InheritableThreadLocal;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadA extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0;i<20;i++){
                System.out.println("A "+ Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
