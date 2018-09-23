package chapter1.t12;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<50000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
