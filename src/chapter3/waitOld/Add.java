package chapter3.waitOld;


/**
 * Created by CELINE on 2018-05-02.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock=lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("celine");
            lock.notifyAll();
        }
    }

}
