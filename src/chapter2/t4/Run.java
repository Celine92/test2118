package chapter2.t4;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(object);
        a.setName("A");
        ThreadB b=new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
