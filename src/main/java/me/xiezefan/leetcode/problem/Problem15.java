package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.util.JsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路，贪心算法
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i=0; i<nums.length-2; i++) {
            if (nums[i] > 0)  {
                break;
            }
            if (i > 0 && nums[i-1] == nums[i]) {
                continue;
            }
            for (int j=i+1; j<nums.length-1; j++) {
                if (nums[i] + nums[j] > 0) {
                    break;
                }
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                for (int k=j+1; k<nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k-1]) {
                        continue;
                    }
                    int ii = nums[i];
                    int jj = nums[j];
                    int kk = nums[k];
                    int sum = ii + jj + kk;
                    if (sum == 0) {
                        List<Integer> subList = new ArrayList<Integer>();
                        subList.add(ii);
                        subList.add(jj);
                        subList.add(kk);
                        result.add(subList);
                    }
                    else if (sum > 0) {
                        break;
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        System.out.println(JsonUtil.toJson(new Problem15().threeSum(new int[] {-1, 0, 1, 2, -1, -4})));
        System.out.println("Time:" + (System.currentTimeMillis() - current));
    }
}
