package chapter2.Volatile;

/**
 * Created by CELINE on 2018-04-25.
 */
public class PrintString {
    private boolean isContinusPrint=true;

    public boolean isContinusPrint() {
        return isContinusPrint;
    }

    public void setContinusPrint(boolean continusPrint) {
        isContinusPrint = continusPrint;
    }

    public void printStringMethod(){
        try{
            while(isContinusPrint==true){
                System.out.println("run printStringMethod threadName=" +
                Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
