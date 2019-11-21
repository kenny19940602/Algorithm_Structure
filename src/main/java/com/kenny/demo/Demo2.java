package com.kenny.demo;

/**
 * ClassName: Demo2
 * Function:  类初始化过程
 * Date:      2019/11/21 14:23
 * @author     Kenny
 * version    V1.0
 */
public class Demo2 {

    public static void main(String[] args) {
        new Sub();
    }
}

class Super{
    int a = 5;
    Super(){
        super();
        this.test();
    }
    public void test() {
        System.out.println(this.a);
    }


}
class Sub extends Super{
    int a = 6;
    Sub(){
        super();
    }
    public void test() {
        System.out.println(this.a);
    }

}