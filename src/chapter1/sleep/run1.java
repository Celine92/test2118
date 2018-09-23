package chapter1.sleep;

/**
 * Created by CELINE on 2018-04-19.
 */
public class run1 {
    public static void main(String[] args) {
       mythread1 mythread1=new mythread1();
        System.out.println("begin ="+System.currentTimeMillis());
        mythread1.start();
        System.out.println("end ="+System.currentTimeMillis());

    }
}
