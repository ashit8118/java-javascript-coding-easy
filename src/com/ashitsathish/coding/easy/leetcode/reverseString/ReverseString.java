package com.ashitsathish.coding.easy.leetcode.reverseString;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("ashit");
    }

    private static void reverseString(String s) {
        int x = 0;
        int y = s.length() -1;
        char[] c= s.toCharArray();
        while (x<y){
            char temp = c[x];
            c[x] = c[y];
            c[y] = temp;
            x++;
            y--;
        }
        String s1 = new String(c);
        System.out.println(s1);
    }
}
