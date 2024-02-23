public class Demo1 {
    public static void main(String[] args) {
        // abs获取绝对值
        System.out.println(Math.abs(-8));//8
        System.out.println(Math.abs(-8.0));//8.0
        //ceil向上取整
        System.out.println(Math.ceil(8.1));//9.0
        System.out.println(Math.ceil(-8.1));//-8.0
        //floor向下取证
        System.out.println(Math.floor(8.1));//8.0
        System.out.println(Math.floor(-8.1));//-9.0
        //round四舍五入
        System.out.println(Math.round(8.1));//8
        System.out.println(Math.round(8.5));//9
        System.out.println(Math.round(-8.2));//-8
        System.out.println(Math.round(-8.6));//-9
        //max获取两个之中的较大值
        System.out.println(Math.max(1, 2));//2
        System.out.println(Math.max(1.0, 2.0));//2.0
        //pow返回a的b次幂
        System.out.println(Math.pow(2, 2));//4.0
        System.out.println(Math.pow(3, 3));//27.0
        //random获取为double的随机值，[0.0, 1.0)
        System.out.println(Math.random());

    }
}
