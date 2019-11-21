package com.kenny.demo;

import java.util.Arrays;

/**
 * ClassName: BinarySearch
 * Function:  二分查找
 * Date:      2019/11/20 15:03
 * @author     Kenny
 * version    V1.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {23,65,71,71,87,93,99};
        /**
         * 返回找到的元素所在位置,如果重复,返回某个元素的位置
         */
        int index = Arrays.binarySearch(arr, 71);//2  3
        System.out.println(index);
        index = Arrays.binarySearch(arr, 87);// 4
        System.out.println(index);
        index = Arrays.binarySearch(arr, 23);// 0
        System.out.println(index);
        //如果找不到,返回: -插入位置-1
        index = Arrays.binarySearch(arr,88); //  -5-1  -6
        System.out.println(index + "," + (-(index + 1)));
        index = Arrays.binarySearch(arr, 1);//  0-1   -1
        //如果需要还原插入位置:  -(index+1)
        System.out.println(index + "," + (-(index + 1)));

//        Collections.binarySearch(list, Key);

    }
}
