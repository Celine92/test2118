package chapter3.test1;

/**
 * Created by CELINE on 2018-04-26.
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            String newString=new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
