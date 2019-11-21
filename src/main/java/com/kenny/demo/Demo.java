package com.kenny.demo;

/**
 * ClassName: Demo
 * Function:  java中方法参数传递方式是按值传递。
 * 如果参数是基本类型，传递的是基本类型的字面量值的拷贝。
 * 如果参数是引用类型，传递的是该参量所引用的对象在堆中地址值的拷贝。
 * 栈独享,堆共享
 * Date:      2019/11/21 11:18
 * @author     Kenny
 * version    V1.0
 */
public class Demo {

    public static void main(String[] args) {
        /*
         * Java 中方法参数只有一种传递方式：值传递，就是
         * 将变量的值，复制一份传递到方法中。
         *
         * Java 没有引用类型传递！！！
         */
        int a = 5;
        int[] arr= {5};
        test(a, arr);
        System.out.println(a+","+arr[0]);
        //A.5,5   B.6,6   C.5,6   D.6,5

        String s = "A";
        StringBuilder ss =new StringBuilder("A");
        test(s, ss);
        System.out.println(s+","+ss);
        //A.A,A   B.A,AA   C.AA,AA   D.AA,A
    }

    public static void test(int a, int[] arr) {
        a++;
        arr[0]++;
    }

    public static void test(String s, StringBuilder ss) {
        s+="A";
        ss.append("A");
    }
}
