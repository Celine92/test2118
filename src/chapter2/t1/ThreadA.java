package chapter2.t1;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }
    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}

