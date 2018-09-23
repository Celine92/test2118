package chapter6.t1;

/**
 * Created by CELINE on 2018-05-07.
 */
public class MyObject {
    private static MyObject instance=null;
    private MyObject(){}
    static {
        instance=new MyObject();
    }
    public static MyObject getInstance(){
        return instance;
    }
}
