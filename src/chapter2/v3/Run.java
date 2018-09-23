package chapter2.v3;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads=new MyThread[100];
        for(int i=0;i<100;i++){
            myThreads[i]=new MyThread();
        }
        for(int i=0;i<100;i++){
            myThreads[i].start();
        }
    }
}
