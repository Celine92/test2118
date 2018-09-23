package chapter3.pcallwait;

/**
 * Created by CELINE on 2018-05-03.
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock=lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                while(ValueObject.value.equals("")){
                    System.out.println("消费者"+
                            Thread.currentThread().getName()+" waiting了-----");
                    lock.wait();
                }
                System.out.println("消费者"+
                        Thread.currentThread().getName()+" runnable了-----");
                ValueObject.value="";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
