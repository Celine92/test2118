package chapter2.atomicIntergerNoSafe;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyService service=new MyService();
            MyThread[] array=new MyThread[5];
            for(int i=0;i<array.length;i++){
                array[i]=new MyThread(service);
            }
            for(int i=0;i<array.length;i++){
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}