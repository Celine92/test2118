package chapter2.t10;

/**
 * Created by CELINE on 2018-04-24.
 */
public class myTask {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized threadName=" +Thread.currentThread().getName()+" i="+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i=0;i<100;i++)
            {
                System.out.println("synchronized threadName=" +Thread.currentThread().getName()
                        +" i="+(i+1));
            }
        }
    }
}
