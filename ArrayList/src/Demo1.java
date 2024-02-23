import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        /*
            boolean add(E e)   添加

            boolean remove(E e)   删除
            E remove(int index)

            E set(int index, E e)   修改

            E get(int index)   查询
            int size()   获取长度

            利用孔灿创建的集合，在底层创建一个默认长度为0的数组
            添加第一个元素时，底层会创建一个新的长度为10的数组
            存满时，会扩容1.5倍
            如果一次添加多个元素，1.5倍还放不下，则新创建的数组的长度以实际为准
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        list.remove("aaa");
        System.out.println(list);

        String string = list.remove(0);
        System.out.println(list);
        System.out.println(string);

        String string2 = list.set(0, "000");
        System.out.println(string2);
        System.out.println(list);

        String string3 = list.get(0);
        System.out.println(string3);
        System.out.println(list);

        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('a');
        list3.add('b');
        list3.add('c');
        System.out.println(list3);
    }
}
