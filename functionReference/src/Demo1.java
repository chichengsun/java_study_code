import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6};
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(Arrays.toString(a));

        /*
        方法引用：
            把已经存在的方法拿过来使用，当做函数式接口中抽象方法的方法体
            ：：方法引用符
            1. 引用处需要时函数式接口
            2. 被引用的方法需要已经存在
            3。 被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
            4. 被引用方法的功能需要满足当前的要求
         */
        Arrays.sort(a, Demo1::subtract);
        System.out.println(Arrays.toString(a));

    }

    public static int subtract(int num1, int num2) {
        return num2 - num1;
    }
}
