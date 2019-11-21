package com.kenny.demo;

import java.util.*;

/**
 * ClassName: Shuffle
 * Function:  打乱算法
 * Date:      2019/11/20 14:30
 * @author     Kenny
 * version    V1.0
 */
public class Shuffle {

    public static void main(String[] args) {
        /**
         * 数据打乱算法(洗牌算法)
         * shuffle:打乱 洗牌
         */
        int[] arr = {4, 1, 5, 6, 8, 3, 9};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        Collections.shuffle(list);
        System.out.println(list);
    }

    private static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i);
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
}
