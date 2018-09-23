package chapter3.stack_1;



/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadC extends Thread {
    private C c;
    public ThreadC(C c){
        super();
        this.c=c;
    }
    @Override
    public void run(){
        while(true){

            c.pushService();
        }
    }
}
