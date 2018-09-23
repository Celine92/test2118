package chapter2.innerStaticClass;

/**
 * Created by CELINE on 2018-04-25.
 */
public class PublicClass {
    static private String username;
    static private String password;
    static class PrivateClass {
        private String age;
        private String address;
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void printPublicProperty(){
            System.out.println(username+" "+password);
        }
    }
}
