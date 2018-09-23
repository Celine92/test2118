package chapter2.t5;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private MyObject myObject;
    public ThreadA(MyObject myObject){
        super();
        this.myObject=myObject;
    }
    @Override
    public void run(){
        super.run();
        myObject.methodA();
    }
}

