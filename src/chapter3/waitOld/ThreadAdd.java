package chapter3.waitOld;

/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadAdd extends Thread {
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }
    @Override
    public void run(){
        p.add();
    }
}
