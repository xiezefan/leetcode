package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.entity.TreeNode;



/**
 * Maximum Depth of Binary Tree
 * Link:https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Created by xiezefan on 15/9/5.
 */
public class Problem104 {

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 1);
    }

    public int maxDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return currentDepth - 1;
        } else {
            int leftMaxDepth = maxDepth(node.left, currentDepth + 1);
            int rightMaxDepth = maxDepth(node.right, currentDepth + 1);
            return leftMaxDepth > rightMaxDepth ? leftMaxDepth : rightMaxDepth;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Problem104().maxDepth(TreeNode.build(new Integer[] {1,2,3,4,null,null,5})));
    }

}
