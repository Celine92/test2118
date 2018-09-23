package chapter2.t13;

/**
 * Created by CELINE on 2018-04-25.
 */
public class ThreadA extends Thread {
    private MyOneList list;
    public ThreadA(MyOneList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        Service service=new Service();
        service.addServiceMethod(list,"A");
    }
}
