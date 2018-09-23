package chapter4.t8;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA[] a=new ThreadA[10];
        ThreadB[] b=new ThreadB[10];
        for(int i=0;i<10;i++){
            a[i]=new ThreadA(service);
            b[i]=new ThreadB(service);
            a[i].start();
            b[i].start();
        }


    }
}
