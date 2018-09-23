package chapter2.test2;

/**
 * Created by CELINE on 2018-04-25.
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();

        this.object=object;
    }

    @Override
    public void run() {
        object.speedPrintString();
    }
}
