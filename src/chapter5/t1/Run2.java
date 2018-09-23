package chapter5.t1;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run2 {
    private static Timer timer=new Timer();
    static public class MyTask extends TimerTask{
        @Override
        public void run(){
            System.out.println("A运行了！ 时间为"+new Date());
            timer.cancel();
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        System.out.println("当前时间："+new Date());
        timer.schedule(myTask,7000);
    }
}
