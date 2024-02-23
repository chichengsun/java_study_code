import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        System.out.println("请输入星期几：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("吃饭");
                break;
            case 4:
                System.out.println("骑车");
                break;
            case 5:
                System.out.println("登山");
                break;
            case 6:
                System.out.println("休息");
                break;
            case 7:
                System.out.println("旅行");
                break;
            default:
                System.out.println("你写错了");
                break;
        }
        switch (week) {
            case 1 -> System.out.println("跑步");
            case 2 -> System.out.println("爬山");
            case 3 -> System.out.println("拳击");
            case 4 -> System.out.println("游泳");
            case 5 -> System.out.println("上课");
            case 6 -> {}
            case 7 -> System.out.println("休息");
            default -> System.out.println("你写错了");

        }
    }
}
