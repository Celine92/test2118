package chapter3.twoThreadTransData;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Test {
    public static void main(String[] args) {
        MyList service=new MyList();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
