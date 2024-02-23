package value;

public class Main {
    public static void main(String[] args) {
        /*
        @Value帮助我们快速创建不可变类
        相当于
            自动为所有字段天剑private final修饰符，使得它们在初始化之后不得被改变
            自动生成所有字段的getter方法，因为字段是final的，所以没有setter方法
            自动生成equals(), hashCode()和toString()方法
            自动生成一个全参数的构造方法
         */
    }
}
