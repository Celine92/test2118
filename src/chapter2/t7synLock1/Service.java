package chapter2.t7synLock1;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();

    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
    }
}
