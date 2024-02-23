package test1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("ss", 18, "man", "123@qq.com");
        System.out.println(user1.getUserName());
        System.out.println(user1.getAge());
        System.out.println(user1.getEmail());
        System.out.println(user1.getGender());
        System.out.println(user1);
    }
}
