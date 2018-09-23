package chapter1.t12;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Run1 {
    public static void main(String[] args) {
       Thread.currentThread().interrupt();
        System.out.println("1"+Thread.interrupted());
        System.out.println("2"+Thread.interrupted());
        System.out.println("end!");
    }

}
