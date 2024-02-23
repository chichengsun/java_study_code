import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 13, 27, 38, 49, 49, 55, 65, 65, 97};
        System.out.println(Arrays.toString(a));

        /*
        如果查找元素存在，返回索引值
        如果查找元素不存在，返回应  -插入位置-1
         */
        System.out.println(Arrays.binarySearch(a, 30));

        System.out.println(Arrays.toString(Arrays.copyOf(a, 2)));
        System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));
        System.out.println(Arrays.toString(Arrays.copyOf(a, 15)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, 9)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, 8)));

//        Arrays.fill(a, 100);
//        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Integer[] b = {4, 13, 27, 38, 49, 49, 55, 65, 65, 97};
        Arrays.sort(b, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(b));
    }
}