package chapter3.twoThreadTransData;

/**
 * Created by CELINE on 2018-04-26.
 */
public class ThreadA extends Thread {
    private MyList list;
    public ThreadA(MyList myList){
        super();
        this.list=myList;
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<10;i++){
                list.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
