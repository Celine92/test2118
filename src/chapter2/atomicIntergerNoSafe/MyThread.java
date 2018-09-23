package chapter2.atomicIntergerNoSafe;

/**
 * Created by CELINE on 2018-04-25.
 */
public class MyThread extends  Thread {
    private MyService myService=new MyService();
    public MyThread(MyService myService){
        this.myService=myService;
    }
    @Override
    public void run(){
        myService.addNum();
    }
}
