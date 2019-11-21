package com.kenny.demo;

import java.math.BigInteger;

/**
 * ClassName: Base64
 * Function:  Base64编码
 * Date:      2019/11/20 14:48
 * @author     Kenny
 * version    V1.0
 */
public class Base64 {

    public static void main(String[] args) {
        /**
         * Base64编码:
         * 用于将一个数字进行压缩编码
         * 将数字进行base64编码
         */
        BigInteger num = new BigInteger("6666666666666666666666666666666666666666666666");
        /**
         * 返回一个byte数组,每个元素是一个Base64字符
         */
        byte[] bytes = org.apache.commons.codec.binary.Base64.encodeInteger(num);
        for (byte b : bytes) {
            System.out.println((char) b);
        }
        System.out.println();
        BigInteger n = org.apache.commons.codec.binary.Base64.decodeInteger(bytes);
        System.out.println(n);
    }
}
