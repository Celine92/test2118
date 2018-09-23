package chapter3.prtest;

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
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get 的值 "+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
