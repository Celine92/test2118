package chapter3.pcallwait;

/**
 * Created by CELINE on 2018-05-03.
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock=lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                while(!ValueObject.value.equals("")){
                    System.out.println("生产者"+
                    Thread.currentThread().getName()+" waiting了");
                    lock.wait();
                }
                System.out.println("生产者"+Thread.currentThread().getName()+
                " RUNNABLE 了");
                String value=System.currentTimeMillis()+"_"+System.nanoTime();
                ValueObject.value=value;
                lock.notifyAll();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
