public class Demo3 {
    public static void main(String[] args) {
        // & 与
        // | 或
        // ^ 异或
        // ！ 非
        // 短路逻辑运算符
        // &&
        // ||
        System.out.println(1 + 2 + "abc" + 1 + 2);

        int a = 10;
        int b = 10;
        int c = 10;
        boolean result = ++a < 5 & ++b < 5;
        boolean con = ++a < 5 && ++c < 5;
        System.out.println(result);
        System.out.println(con);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 三元运算符： 关系表达式?表达一:表达式2
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
