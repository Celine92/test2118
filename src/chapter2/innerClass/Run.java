package chapter2.innerClass;

/**
 * Created by CELINE on 2018-04-25.
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setUsername("celine");
        publicClass.setPassword("123");
        System.out.println(publicClass.getUsername()+" " +publicClass.getPassword());

        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
        privateClass.setAddress("beijing");
        privateClass.setAge("25");
        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());

    }
}
