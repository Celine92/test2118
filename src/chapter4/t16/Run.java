package chapter4.t16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run {
    volatile private static  int nextPrintWho=1;
    private static ReentrantLock lock=new ReentrantLock();
    final private static Condition conditionA=lock.newCondition();
    final private static Condition conditionB=lock.newCondition();
    final private static Condition conditionC=lock.newCondition();

    public static void main(String[] args) {

    }

}
