package chapter4.t10;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
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
        System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁");
    }
}
