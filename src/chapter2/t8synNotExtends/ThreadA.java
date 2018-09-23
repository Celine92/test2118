package chapter2.t8synNotExtends;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private Sub sub;
    public ThreadA(Sub sub){
        super();
        this.sub=sub;
    }
    @Override
    public void run(){
        sub.serviceMethod();
    }
}

