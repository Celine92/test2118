package chapter3.joinLong;


/**
 * Created by CELINE on 2018-05-03.
 */
public class Test {
    public static void main(String[] args) {
        MyThread threadTest=new MyThread();
        threadTest.start();
        try {
            threadTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我想当threadTest对象执行完毕后我再执行");

    }
}
