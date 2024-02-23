import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        Class类中用于获取构造犯法的方法：
        Constructor<?>[] getConstructors()   获取所有公共构造方法对象的数组
        Constructor<?>[] getDeclaredConstructors()   返回所有构造方法对象的数组
        Constructor<T> getConstructor(Class<?>...parameterTypes)  返回单个公共构造方法对象
        constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)  返回单个构造方法对象

        Constructor类中用于创建对象的方法
        T newInstatnce(Object... initargs)  根据指定的构造方法创建对象
        setAccessible(boolean flag)  设置为true，表示取消访问检查
         */
        Class<?> student = Class.forName("Student");
        System.out.println("获取到的public构造方法对象：");
        Constructor<?>[] c1 = student.getConstructors();
        for (Constructor<?> constructor : c1) {
            System.out.println(constructor);
        }
        System.out.println("获取到的所有的构造方法对象：");
        Constructor<?>[] c2 = student.getDeclaredConstructors();
        for (Constructor<?> constructor : c2) {
            System.out.println(constructor);
        }
        System.out.println("获取到的参数为空的构造方法对象：");
        Constructor<?> c3 = student.getConstructor();
        System.out.println(c3);
        System.out.println("获取到的参数为string的构造方法对象");
        Constructor<?> c4 = student.getDeclaredConstructor(String.class);
        System.out.println(c4);
        System.out.println("获取到的参数为int的构造方法对象");
        Constructor<?> c5 = student.getDeclaredConstructor(int.class);
        System.out.println(c5);
        System.out.println("获取到的参数为string和int的构造方法对象");
        Constructor<?> c6 = student.getConstructor(String.class, int.class);
        System.out.println(c6);

        //获取构造方法的权限修饰符
        int modifiers = c6.getModifiers();
        System.out.println(modifiers);

        //获取构造方法的参数
        Parameter[] parameters = c6.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //使用获取到的构造方法实例化对象
        Student ss = (Student) c6.newInstance("ss", 18);
        System.out.println(ss);

        //使用私有构造方法实例化对象
        c4.setAccessible(true); //表示临时取消权限校验
        Student s2 = (Student) c4.newInstance("ss");
        System.out.println(s2);
    }
}
