import chapter2.t10doubleSynBlockOneTwo.ObjectService;
import chapter2.t10doubleSynBlockOneTwo.Thread1;
import chapter2.t10doubleSynBlockOneTwo.Thread2;

/**
 * Created by CELINE on 2018-04-24.
 */
public class run {
    public static void main(String[] args) {
        ObjectService myTask=new ObjectService();
        Thread1 A=new Thread1(myTask);
        A.setName("A");
        A.start();
        Thread2 B=new Thread2(myTask);
        B.setName("B");
        B.start();
    }
}
