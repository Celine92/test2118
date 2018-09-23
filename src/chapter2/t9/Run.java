package chapter2.t9;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        Thread1 thread1=new Thread1(task);
        thread1.start();
        Thread2 thread2=new Thread2(task);
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime=CommonUtils.beginTime1;
        if(CommonUtils.BeginTime2<CommonUtils.beginTime1){
            beginTime=CommonUtils.BeginTime2;
        }
        long endTime=CommonUtils.endTime1;
        if(CommonUtils.endTime1>CommonUtils.endTime2){
            endTime=CommonUtils.endTime2;
        }
        System.out.println("耗时："+(endTime-beginTime)/1000);

    }
}
