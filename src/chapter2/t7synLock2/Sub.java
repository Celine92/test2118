package chapter2.t7synLock2;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Sub extends  Main{
    synchronized public void operateISubMethod(){
        try {
            while(i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
