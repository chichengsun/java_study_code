package data;

public class Main {
    public static void main(String[] args) {
        /*
        @Date注解相当于
            @Getter
            @Setter
            @ToString
            @EqualsAndHashCode
            @RequiredArgsConstructor

        @Data(staticConstructor = "create")
            生成一个名为create() 静态实体类生成方法
            同时私有化@RequiredArgsConstructor生成的构造函数
         */
    }
}
