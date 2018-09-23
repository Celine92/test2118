package chapter3.stack_1;

/**
 * Created by CELINE on 2018-05-03.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack=myStack;
    }

    public void pushService(){
        System.out.println("pop="+myStack.pop());
    }
}
