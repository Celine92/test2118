package chapter3.ThreadLocal22;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return "我是默认值 第一次get不再为null";
    }
}
