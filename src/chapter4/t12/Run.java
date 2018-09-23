package chapter4.t12;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
       Thread[] a=new Thread[10];
       for(int i=0;i<10;i++){
           a[i]=new Thread(runnable);
       }
       for(int i=0;i<10;i++){
           a[i].start();
       }
       Thread.sleep(2000);
        service.notityMethod();
    }
}
