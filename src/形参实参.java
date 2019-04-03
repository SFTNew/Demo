import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 方法的参数传递机制
 * 1.形参是基本数据类型，传递的是实参的值
 * 2.形参是引用数据类型，传递的是实参的地址，其中String ，包装类（Integer等）对象不可变
 */

public class 形参实参 {
    public static void main(String[] arg){
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr =new int[]{1,2,3,4,5};
        MyData my = new MyData();
        change(i,str,num,arr,my);
        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(my.a);

    }

    private static void change(int i, String str, Integer num, int[] arr, MyData my) {
        i += 1;
        //在这个时候 str 已经被赋予了新的地址
        str += " word";
        num += 1;
        arr[0] +=1;
        my.a += 1;
    }

    public static class  MyData{
            int a = 10;
    }
}
