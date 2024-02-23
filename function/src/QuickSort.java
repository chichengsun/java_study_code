public class QuickSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 65, 13, 27, 49, 55, 4};
        print(a);
        qSort(a, 0, 9);
        print(a);
    }

    public static int partition(int[] a, int low, int high) {
        int index = low;
        int key = a[low];
        while (low != high) {
            while (true) {
                if (low < high && a[high] >= key) {
                    high --;
                }else {
                    break;
                }
            }
            while (true) {
                if (low < high && a[low] <= key) {
                    low ++;
                }else {
                    break;
                }
            }
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
        int temp = a[low];
        a[low] = key;
        a[index] = temp;
        return low;
    }

    public static void qSort(int[] a, int low, int high) {
        if (low < high) {
            int index = partition(a, low, high);
            qSort(a, low, index - 1);
            qSort(a, index + 1, high);
        }
    }

    public static void print(int[] a) {
        for (int j : a) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
}
