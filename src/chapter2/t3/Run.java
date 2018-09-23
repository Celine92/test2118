package chapter2.t3;

/**
 * Created by CELINE on 2018-04-24.
 * synchronized取得的锁都是对象锁，而不是一把代码或者方法当做锁
 * 多个线程访问多个对象，则会创建多个锁，所以产生的结果是异步的
 *
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1=new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2=new HasSelfPrivateNum();
        ThreadA athread=new ThreadA(numRef1);
        athread.start();
        ThreadB bthread=new ThreadB(numRef2);
        bthread.start();
    }
}
