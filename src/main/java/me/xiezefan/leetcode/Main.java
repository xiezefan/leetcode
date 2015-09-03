package me.xiezefan.leetcode;

import me.xiezefan.leetcode.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Main Class
 * Created by xiezefan on 15/9/3.
 */
public class Main {

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
        System.out.println(JsonUtil.toJson(new Main().twoSum(new int[]{3, 2, 4}, 6)));
    }
}
