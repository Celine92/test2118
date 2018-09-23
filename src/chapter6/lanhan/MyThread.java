package chapter6.lanhan;

import chapter6.ehan.MyObject;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
