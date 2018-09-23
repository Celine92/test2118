package chapter3.InheritableThreadLocal;

/**
 * Created by CELINE on 2018-05-04.
 */
public class InheritableThreadLocalExt  extends InheritableThreadLocal{
    @Override
    protected Object initialValue(){
        return System.currentTimeMillis();
    }

}
