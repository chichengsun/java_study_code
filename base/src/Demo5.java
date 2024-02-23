import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数：");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int i = temp % 10;
            temp /= 10;
            sum = sum * 10 + i;
        }
        if (sum == number) {
            System.out.println("回文数!");
        } else {
            System.out.println("no 回文数!");
        }

        System.out.println("输入a的值：");
        int a = sc.nextInt();
        System.out.println("输入b的值：");
        int b = sc.nextInt();
        int shang = 0;
        while (b > a) {
            b -= a;
            shang ++;
        }
        int yvshu = b;
        System.out.println("商为：" + shang);
        System.out.println("余数为：" + yvshu);
    }
}
