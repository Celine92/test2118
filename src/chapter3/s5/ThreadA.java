package chapter3.s5;

import java.util.Date;

/**
 * Created by CELINE on 2018-05-04.
 */
public class ThreadA extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0;i<20;i++){
                if(Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("A "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
