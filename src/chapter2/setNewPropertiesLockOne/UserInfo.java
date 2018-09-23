package chapter2.setNewPropertiesLockOne;

/**
 * Created by CELINE on 2018-04-25.
 */
public class UserInfo {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    public UserInfo(String username,String password){
        this.username=username;
        this.password=password;
    }

    public UserInfo(){}
}
