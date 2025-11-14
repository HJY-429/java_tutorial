package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
      /* 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
        返回字符串中最后一个单词的长度。
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

        示例 1：输入：s = "Hello World“	输出：5
        解释：最后一个单词是“World”，长度为5。 */

        //倒着遍历
        //直到遇到空格为止
        //那么遍历的次数就是单词的长度

        // 示例输入
        String s = "I love JiangYutong Sanshier Huasheng";
 
        // 调用函数获取最后一个单词的长度
        int length = lengthOfLastWord(s);
 
        // 输出结果
        System.out.println("最后一个单词的长度是: " + length);
    }
 
    public static int lengthOfLastWord(String s) {
        // 去除字符串末尾的空格
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
 
        // 如果字符串为空或只包含空格，则返回0
        if (end < 0) {
            return 0;
        }
        // 从字符串末尾开始遍历，直到找到第一个空格字符
        int length = 0;
        while (end >= 0 && s.charAt(end) != ' ') {
            length++;
            end--;
        }
        return length;

    }
}
