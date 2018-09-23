package chapter1.t17;


/**
 * Created by CELINE on 2018-04-23.
 */
public class Run {
    public static void main(String[] args) {
      for (int i=0;i<5;i++ ){
          MyThread thread=new MyThread();
          thread.setPriority(5);
          thread.start();
          MyThread2 thread2=new MyThread2();
          thread2.setPriority(6);
          thread2.start();
      }

    }
}


