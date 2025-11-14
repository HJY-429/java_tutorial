package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
       /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。*/


        //1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] letters = new char[52];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            letters[index++] = c;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            letters[index++] = c;
        }
 
        // 2. 创建一个存储验证码的字符数组
        char[] verifyCode = new char[5];
 
        // 3. 从letters数组中随机获取4个字母
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(letters.length);
            verifyCode[i] = letters[randomIndex];
            // 为了避免重复选择同一个字母（虽然在这个特定情况下不是必需的，因为数组足够大且只选4个），
            // 我们可以将已选的字母置为一个特殊值（如'\0'），但在这里为了简化代码，我们省略这一步。
        }
 
        // 4. 生成一个0~9之间的随机数作为验证码的最后一位
        verifyCode[4] = (char) ('0' + random.nextInt(10));
 
        // 5. 将数字与前面的某个字母位置随机交换（可选步骤，为了增加随机性）
        int swapIndex = random.nextInt(4); // 生成0到3之间的随机索引
        char temp = verifyCode[4]; // 临时保存数字
        verifyCode[4] = verifyCode[swapIndex]; // 将数字与随机位置的字母交换
        verifyCode[swapIndex] = temp; // 将原位置的字母放到数字原来的位置
 
        // 6. 将字符数组转换为字符串并输出
        String result = new String(verifyCode);
        System.out.println("生成的验证码是: " + result);
    }
}
