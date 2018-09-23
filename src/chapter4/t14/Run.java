package chapter4.t14;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service1=new Service();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethod时间："
                +System.currentTimeMillis());
                service1.waitMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.setName("A");
        thread.start();

        Thread threadb=new Thread(runnable);
        threadb.setName("B");
        threadb.start();


    }
}
