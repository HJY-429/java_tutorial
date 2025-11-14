package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /* 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意：需要用已有的知识完成。*/

        //不需要考虑乘积过大之后的结果
        //就认为乘积一定是小于int的最大值的


        String num1 = "123456789";
        String num2 = "12345";

        // 1. 将num1和num2转换为整数（这里使用long类型来避免溢出）
        long n1 = 0, n2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            n1 = n1 * 10 + (num1.charAt(i) - '0');
        }
        for (int i = 0; i < num2.length(); i++) {
            n2 = n2 * 10 + (num2.charAt(i) - '0');
        }
 
        // 2. 利用整数进行相乘
        long product = n1 * n2;
 
        // 3. 把整数变成字符串
        String result = Long.toString(product);
 
        // 输出结果
        System.out.println("乘积是: " + result);


    }
}
