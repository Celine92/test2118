package chapter6.ehan;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyObject {
    //立即加载方式==饿汉模式
    private static MyObject myObject=new MyObject();
    private MyObject(){}
    public static MyObject getInstance(){
        return myObject;
    }
}
