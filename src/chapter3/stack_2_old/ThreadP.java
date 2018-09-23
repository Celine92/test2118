package chapter3.stack_2_old;


/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }
    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}
