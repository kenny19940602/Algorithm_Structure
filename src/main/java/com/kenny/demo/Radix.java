package com.kenny.demo;

/**
 * ClassName: Radix
 * Function:  进制数转化
 * Date:      2019/11/20 14:38
 * @author     Kenny
 * version    V1.0
 */
public class Radix {

    public static void main(String[] args) {
        String base7 = "123";
        int n = Integer.parseInt(base7, 7);
        System.out.println(n);
        n = parseInt(base7,7);
    }

    public static int parseInt(String string, int radix) {
        int weight = 1;
        int sum = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            char c = string.charAt(i);
            int n = c = '0';
            if (n>=radix){
                throw new RuntimeException("超范围" + n);
            }
            sum += n * weight;
            weight *= radix;
        }
        return sum;
    }
}
