package chapter3.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CELINE on 2018-04-26.
 */
public class MyList {
    private List list=new ArrayList();
    public void add(){
        list.add("chendan");

    }
    public int size(){
        return list.size();
    }
}
