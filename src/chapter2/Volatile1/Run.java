package chapter2.Volatile1;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run
{
    public static void main(String[] args) {
        PrintString printString=new PrintString();
        new Thread(printString).start();
        System.out.println("我要停止他！stopThread=" +Thread.currentThread().getName());
        printString.setContinusPrint(false);
    }
}
