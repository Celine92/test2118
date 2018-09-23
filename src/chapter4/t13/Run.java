package chapter4.t13;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) {
        final Service service1=new Service(true);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
