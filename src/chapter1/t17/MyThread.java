package chapter1.t17;

import java.util.Random;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        long beginTime=System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            Random random=new Random();
            random.nextInt();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("********thread 1 user time="+(endTime-beginTime));
    }
}
