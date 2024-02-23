public class Demo2 {
    public static void main(String[] args) {
        /*
        public String getMessage() 返回此throwable的详细消息字符串
        public String toString() 返回此throwable的简短描述
        public void printStackTrace() 把异常的错误信息输出在控制台
         */
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();//仅仅是打印信息，不会中断程序
        }
    }
}
