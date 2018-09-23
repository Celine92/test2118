package chapter2.t1;

/**
 * Created by CELINE on 2018-04-24.
 */
public class HasSelfPrivateNum {
    public synchronized void addI(String username){
        try{
            int num=0;
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username+"num= " +num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
