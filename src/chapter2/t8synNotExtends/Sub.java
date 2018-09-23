package chapter2.t8synNotExtends;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Sub extends chapter2.t8synNotExtends.Main {
    @Override
     public  void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName="
                    +Thread.currentThread().getName()+" time="+
                    System.currentTimeMillis());
            Thread.sleep(500);
            System.out.println("int sub 下一步 sleep end threadName="
                    +Thread.currentThread().getName()+" time="+
                    System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
