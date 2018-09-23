package chapter3.dbtools;

/**
 * Created by CELINE on 2018-08-30.
 */
public class dbTool {
    private boolean flag=false;

    synchronized public void insertA(){
        try {
            while(flag==true){
                wait();
            }
            for (int i=0;i<5;i++){
                System.out.println("*****");
            }
            flag=true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void insertB(){
        try {
            while(flag!=true){
                wait();
            }
            for (int i=0;i<5;i++){
                System.out.println("------");
            }
            flag=false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
