package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;


public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            hash.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {

            if (hash.containsKey(target - nums[i])) {
                if (i == hash.get(target - nums[i])) {
                    continue;
                }
                int[] result = new int[2];
                result[0] = i + 1;
                result[1] = hash.get(target - nums[i]) + 1;
                return result;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(JsonUtil.toJson(new Problem1().twoSum(new int[]{3, 2, 4}, 6)));

    }
}
