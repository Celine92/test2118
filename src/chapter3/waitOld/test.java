package chapter3.waitOld;

/**
 * Created by CELINE on 2018-05-03.
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        Add add=new Add(lock);
        Subtract subtract=new Subtract(lock);
        ThreadSubtract subtract1Thread=new ThreadSubtract(subtract);
        subtract1Thread.setName("sub1Thread");
        subtract1Thread.start();
        ThreadSubtract subtract2Thread=new ThreadSubtract(subtract);
        subtract2Thread.setName("sub2Thread");
        subtract2Thread.start();
        Thread.sleep(2000);
        ThreadAdd addThread=new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();

    }
}
