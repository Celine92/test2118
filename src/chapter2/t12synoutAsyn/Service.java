package chapter2.t12synoutAsyn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Service {
  private List list=new ArrayList();
   synchronized public void add(String username){
       System.out.println("ThreadName="+Thread.currentThread().getName()+" 执行了add方法！");
       list.add(username);
       System.out.println("ThreadName="+Thread.currentThread().getName()+" 退出了了add方法！");
   }

    synchronized public int getSize(){
        System.out.println("ThreadName="+Thread.currentThread().getName()+" 执行了getsize方法！");
        int size=list.size();
        System.out.println("ThreadName="+Thread.currentThread().getName()+" 退出了了getsize方法！");
        return size;
    }
}
