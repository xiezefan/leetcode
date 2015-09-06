package me.xiezefan.leetcode.problem;

/**
 * Add Digits
 * Link:https://leetcode.com/problems/add-digits/
 * Created by xiezefan on 15/9/6.
 */
public class Problem258 {

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {

            return num % 9 == 0 ? 9 : num % 9;
        }
    }

    public static void main(String[] args) {
        Problem258 problem258 = new Problem258();

        for (int i=0; i<1000; i++) {
            System.out.println(i + ":" + problem258.addDigits(i));
        }
    }
}
