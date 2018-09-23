package chapter3.twoThreadTransData;

/**
 * Created by CELINE on 2018-04-26.
 */
public class ThreadB extends Thread {
    private MyList list;
    public ThreadB(MyList myList){
        super();
        this.list=myList;
    }
    @Override
    public void run(){
        try{

            while(true)
            { //System.out.println("begin"+list.size());
                if(list.size()==5){

                    System.out.println("==5了，线程b要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
