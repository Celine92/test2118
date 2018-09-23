package chapter2.setNewStringTwoLock;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService=myService;
    }
    @Override
    public void run(){
        super.run();
        myService.testMethod();
    }
}

