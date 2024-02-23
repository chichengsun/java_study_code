import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i ++) {
            int random_index = r.nextInt(arr.length);
            System.out.println(random_index);
            int temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
