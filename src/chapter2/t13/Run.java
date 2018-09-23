package chapter2.t13;


/**
 * Created by CELINE on 2018-04-24.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyOneList list=new MyOneList();
            ThreadA a=new ThreadA(list);
            a.setName("A");
            a.start();
            ThreadB b=new ThreadB(list);
            b.setName("B");
            b.start();
            Thread.sleep(6000);
            System.out.println("listSize=" +list.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
