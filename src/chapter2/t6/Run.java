package chapter2.t6;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {

        try {
            PublishVar publishVar=new PublishVar();
            ThreadA thread=new ThreadA(publishVar);
            thread.start();
            Thread.sleep(2);
            publishVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
