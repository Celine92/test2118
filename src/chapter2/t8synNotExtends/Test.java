package chapter2.t8synNotExtends;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Test  {
    public static void main(String[] args) {
        Sub subRef=new Sub();
        ThreadA a=new ThreadA(subRef);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(subRef);
        b.setName("B");
        b.start();

    }
}
