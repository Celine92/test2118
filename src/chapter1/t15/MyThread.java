package chapter1.t15;

/**
 * Created by CELINE on 2018-04-23.
 */
public class MyThread extends  Thread{
    @Override
    public void run(){
        super.run();
        try {
            for(int i=0;i<100000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，在遇到了sleep进入catch!");
            e.printStackTrace();
        }

    }
}
