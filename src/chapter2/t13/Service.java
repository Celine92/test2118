package chapter2.t13;

/**
 * Created by CELINE on 2018-04-24.
 */
public class Service {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
