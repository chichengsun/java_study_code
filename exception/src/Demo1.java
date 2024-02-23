public class Demo1 {
    public static void main(String[] args) {
        /*
        自己处理异常：
            try {
                可能出现异常的代码;
            } catch(异常类名 变量名) {
                异常的处理代码;
            }
         目的就是，当程序出现问题时，可以继续执行下去
         */
        int[] a = {1, 2, 3, 4};
//        try {
//            System.out.println(a[10]);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("索引越界了！");
//        }

        /*
        如果try中可能会遇到多个问题，怎么执行
            书写多个catch与之对应
            注意：如果我们要捕获多个异常，这些异常当中如果存在父子关系时，那么父类一定要写在下面
         */
        try {
            System.out.println(a[10]);
//            System.out.println(1 / 0);
//            String[] str = new String[3];
//            System.out.println(str[0].equals("abc"));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (Exception e) {
            System.out.println("异常");
        }
    }
}
