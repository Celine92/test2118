package chapter3.prtest;

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
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value=System.currentTimeMillis()+"_"
                        +System.nanoTime();
                System.out.println("set的值是 "+value);
                ValueObject.value=value;
                lock.notify();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
