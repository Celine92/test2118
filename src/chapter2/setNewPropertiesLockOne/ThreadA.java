package chapter2.setNewPropertiesLockOne;

/**
 * Created by CELINE on 2018-04-24.
 */
public class ThreadA extends  Thread {
    private Service Service;
    private UserInfo userinfo;
    public ThreadA(Service Service,UserInfo userInfo){
        super();
        this.Service=Service;
        this.userinfo=userInfo;
    }
    @Override
    public void run(){
        super.run();
        Service.serviceMethodA(userinfo);
    }
}

