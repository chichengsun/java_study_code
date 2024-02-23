public class Demo2 {
    public static void main(String[] args) {
        // 隐式转换 取值范围小的 -> 取值范围大的
        // 强制转换 取值范围大的 -> 取值范围小的
        double a = 11.2;
        int b = (int)a;
        System.out.println(b);
        // 数据类型不一样时，取值范围小的会转化为取值范围大的，然后进行计算
        // byte short char在计算时，会首先转化成int类型，然后进行计算
    }
}
