package chapter2.t6;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private PublishVar publishVar;
    public ThreadA(PublishVar publishVar){
        super();
        this.publishVar=publishVar;
    }
    @Override
    public void run(){
        super.run();
        publishVar.setValue("B","BB");

    }
}

