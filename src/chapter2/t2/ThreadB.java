package chapter2.t2;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }
    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}
