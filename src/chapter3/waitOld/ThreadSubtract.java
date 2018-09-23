package chapter3.waitOld;

/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r=r;
    }
    @Override
    public void run(){
        r.subtract();
    }
}
