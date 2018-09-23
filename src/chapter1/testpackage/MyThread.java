package chapter1.testpackage;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        long beginTime=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<50000000;i++){
            Thread.yield();
            count=count+(i+1);
        }
        long endTime= System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒");


    }
}
