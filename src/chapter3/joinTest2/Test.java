package chapter3.joinTest2;



/**
 * Created by CELINE on 2018-05-03.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest=new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest执行完我在执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
