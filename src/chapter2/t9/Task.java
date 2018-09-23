package chapter2.t9;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Task {
    private String getDate1;
    private String getDate2;
    public synchronized  void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getDate1="长时间处理任务后从远程返回的值1 threadName="
                    +Thread.currentThread().getName();
            getDate2="长时间处理任务后从远程返回的值2 threadName="
                    +Thread.currentThread().getName();
            System.out.println(getDate1);
            System.out.println(getDate2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
