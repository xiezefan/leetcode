package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.util.JsonUtil;

/**
 * Single Number
 * Link:https://leetcode.com/problems/single-number/
 * Created by xiezefan on 15/9/5.
 */
public class Problem136 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = result ^ n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(JsonUtil.toJson(new Problem136().singleNumber(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4})));
    }

}
