package chapter2.t13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CELINE on 2018-04-25.
 */
public class MyOneList {
    private List list=new ArrayList();
    synchronized  public void add(String data)
    {
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
