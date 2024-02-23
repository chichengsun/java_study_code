public class Demo2 {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
        System.out.println(getSum(10.0, 2.0));
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        printArr(array1);
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static double getSum(double num1, double num2) {
        return num1 + num2;
    }

    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
