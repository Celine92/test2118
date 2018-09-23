package chapter3.stack_2_old;


/**
 * Created by CELINE on 2018-05-03.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        P p=new P(myStack);
        C c1=new C(myStack);
        C c2=new C(myStack);
        C c3=new C(myStack);
        C c4=new C(myStack);
        C c5=new C(myStack);
        ThreadP thread1=new ThreadP(p);
        thread1.start();

        ThreadC thread2=new ThreadC(c1);
        ThreadC thread3=new ThreadC(c2);
        ThreadC thread4=new ThreadC(c3);
        ThreadC thread5=new ThreadC(c4);
        ThreadC thread6=new ThreadC(c5);

        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }
}
