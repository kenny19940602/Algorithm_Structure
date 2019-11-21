package com.kenny.demo;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: GetMaxNum
 * Function:  取最大数
 * Date:      2019/11/20 15:49
 * @author     Kenny
 * version    V1.0
 */
public class GetMaxNum {

    public static void main(String[] args) {
        /**
         * 有"非常大量"的数据,取最大的前100大的数据.
         * 1. 利用随机数模拟非常大量的数据
         * 2. 先找到前5个大的
         * 3. 然后扩大到100个大的
         */
        Random r = new Random();
        long[] arr = new long[5];
        for (int i = 0; i < 100; i++) {
            long num = r.nextInt(100);
            int index = Arrays.binarySearch(arr, num);
            if (index < 0) {
                index = -(index + 1);
            }
            //比第一个元素下或与第一个元素一样
            if (index == 0) {
                continue;
            }
            for (int j = 1; j < index; j++) {
                arr[j - 1] = arr[j];
            }
            arr[index - 1] = num;
            System.out.println(index);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
