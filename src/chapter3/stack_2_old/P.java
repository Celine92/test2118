package chapter3.stack_2_old;

/**
 * Created by CELINE on 2018-05-03.
 */
public class P {
    private MyStack myStack;
    public P(MyStack myStack){
        super();
        this.myStack=myStack;
    }

    public void pushService(){
        myStack.push();
    }

}
