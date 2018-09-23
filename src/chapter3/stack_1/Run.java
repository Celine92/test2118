package chapter3.stack_1;


/**
 * Created by CELINE on 2018-05-03.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        P p=new P(myStack);
        C c=new C(myStack);
        ThreadP thread1=new ThreadP(p);
        ThreadC thread2=new ThreadC(c);
        thread1.start();
        thread2.start();
    }
}
