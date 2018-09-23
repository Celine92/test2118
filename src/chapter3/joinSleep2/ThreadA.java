package chapter3.joinSleep2;

/**
 * Created by CELINE on 2018-08-31.
 */
public class ThreadA  extends Thread{
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }
    @Override
    public void run(){
        synchronized (b){
            try {
                b.start();
                b.join();
              /* for(int i=0;i<Integer.MAX_VALUE;i++){
                   String newString=new String();
                   Math.random();
               }*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
