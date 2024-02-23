public class Demo1 {
    public static void main(String[] args) {
        // 数组的静态初始化
        int[] array = new int[]{1, 2, 3};
        int[] array2 = {1, 2, 3};
        String[] array4 = new String[]{"zhangsan", "lisi", "wangwu"};
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("array数组中最大的数为：" + max);
        System.out.println(array[0]);
        System.out.println(array2[0]);
        System.out.println(array2.length);
        System.out.println(array4[0]);
        // 数组的动态初始化
        int[] array3 = new int[5];
        array3[0] = 5;
        for (int i = 0; i < 5; i ++) {
            System.out.println(array3[i]);
        }
    }
}
