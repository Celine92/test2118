package chapter2.t7synLock1;

/**
 * Created by CELINE on 2018-04-24.
 * 可重入锁：某个对象获得了某个对象锁，此时这个对象锁还没有释放，当其再次想要获取这个对象的锁的时候还是可以获取的
 * 如果不可锁重入，就会造成死锁
 */
public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
