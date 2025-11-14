package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容

        //1.键盘输入任意字符串
        //String str = "abcdefg";
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str = scanner.nextLine();
        scanner.close();


        //2.打乱里面的内容
        //修改字符串里面的内容：
        //1.subString
        //2.变成字符数组
        char[] arr = str.toCharArray();//['a','b','c','d','e','f','g']

        //3.打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的交换
        //当数组里面的每一个元素都跟一个随机索引进行交换完毕之后，那么内容就打乱了
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 生成一个随机索引，注意要排除已经遍历过的索引（对于简单打乱，此步可省略，但为严谨性保留）
            // 但由于Java中的Random.nextInt(int bound)方法已经能够处理边界情况，所以直接使用即可
            int randomIndex = random.nextInt(arr.length);
 
            // 交换位置
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //4.把字符数组再变回字符串
        String result = new String(arr);

        System.out.println(result);
    }
}
