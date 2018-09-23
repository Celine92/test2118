package chapter2.t5;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadB extends Thread {
    private MyObject myObject;
    public ThreadB(MyObject myObject){
        super();
        this.myObject=myObject;
    }
    @Override
    public void run(){
        super.run();
        myObject.methodB();
    }
}
