package chapter3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CELINE on 2018-04-26.
 */
public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("chendan");

    }
    public static int size(){
        return list.size();
    }
}
