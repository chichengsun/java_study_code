package test1;

public class User {
    private String userName;
    private int age;
    private String gender;
    private String email;

    public User() {
    }

    /**
     *
     * @param userName username
     * @param age user age
     * @param gender user gender
     * @param email user email
     */
    public User(String userName, int age, String gender, String email) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName set username
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age set user age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender set user gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email set user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "User{userName = " + userName + ", age = " + age + ", gender = " + gender + ", email = " + email + "}";
    }
}
