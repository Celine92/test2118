package chapter2.synTwoLock;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Service {
    synchronized public static void printA(){

            System.out.println("线程名称为："+Thread.currentThread().getName()
            +"在"+System.currentTimeMillis()+"进入printA");

            System.out.println("线程名称为："+Thread.currentThread().getName()
                    +"在"+System.currentTimeMillis()+"退出printA");

    }
    synchronized public static void printB(){
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"退出printB");
    }

    synchronized public static void printC(){
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"进入printC");
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"退出printC");
    }
}
