package chapter1.t12;



/**
 * Created by CELINE on 2018-04-23.
 */
public class Run {
    public static void main(String[] args) {
        try{
          MyThread thread=new MyThread();
          thread.start();
          Thread.sleep(1000);
          thread.interrupt();
          System.out.println("1"+thread.isInterrupted());
          System.out.println("2"+thread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}


