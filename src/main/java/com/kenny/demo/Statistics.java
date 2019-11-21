package com.kenny.demo;

import java.util.Arrays;

/**
 * ClassName: Statistics
 * Function:  统计次数
 * Date:      2019/11/20 14:56
 * @author     Kenny
 * version    V1.0
 */
public class Statistics {

    public static void main(String[] args) {
        /**
         * 统计数组字符串中每个数字的个数
         * 统计英文大写字符串中每个字母的个数
         */
        String str = "3123129434890124810948190248190234809";
        int[] counter = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            counter[c - '0']++;
        }
        System.out.println(Arrays.toString(counter));

        /**
         * 统计英文大写字符串中每个字母的个数
         */
        str = "SDFSDKLFJOIJOWALJFLSDKJVPOQWIJFOPIQWJFV";
        counter = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //c = 'A'  'B'
            counter[c - 'A']++;
        }
        System.out.println(Arrays.toString(counter));
        char c = 'A';
        for (int i : counter) {
            System.out.println(c++ +": "+ i);
        }
    }
}
