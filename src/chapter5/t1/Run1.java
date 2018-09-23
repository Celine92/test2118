package chapter5.t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by CELINE on 2018-05-04.
 */
public class Run1 {
    private static Timer timer=new Timer();
    static public class MyTaskA extends TimerTask{
        @Override
        public void run(){
            System.out.println("A运行了！ 时间为"+new Date());
            timer.cancel();
        }
    }

    static public class MyTaskB extends TimerTask{
        @Override
        public void run(){
            System.out.println("B运行了！ 时间为"+new Date());
        }
    }

    public static void main(String[] args) {
        try{
            MyTaskA taskA=new MyTaskA();
            MyTaskB taskB=new MyTaskB();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString="2018-05-04 16:32:55";
            Date dateRef=sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef+"当前时间："
            +new Date());
            timer.schedule(taskA,dateRef,2000);
            timer.schedule(taskB,dateRef,2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
