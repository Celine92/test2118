package chapter6.lanhan;

/**
 * Created by CELINE on 2018-05-04.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}
    public static MyObject getInstance(){
        try{
            if(myObject!=null){
            }else{
                Thread.sleep(30000);
                myObject=new MyObject();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;

    }
}
