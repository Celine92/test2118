package chapter3.ThreadLocal33;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return System.currentTimeMillis();
    }
}
