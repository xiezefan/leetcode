package me.xiezefan.leetcode.problem;

/**
 * Number of 1 Bits
 * Link:https://leetcode.com/problems/number-of-1-bits/
 * Created by xiezefan on 15/9/7.
 */
public class Problem191 {

    public int hammingWeight(int n) {
        int result = 0;
        long unsignedN = n & 0xffffffffl; // 0xffffffffl = 0000 0000 0000 0000 0000 0000 0000 0000 1111 1111 1111 1111 1111 1111 1111 1111
        while (unsignedN > 0) {
            result += unsignedN % 2;
            unsignedN = unsignedN / 2;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Problem191().hammingWeight((int) 2147483648l));

        System.out.println(11 & 0xf);
    }
}
