package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Same Tree
 * Link:https://leetcode.com/problems/same-tree/
 * Created by xiezefan on 15/9/6.
 */
public class Problem100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return printTree(p).equals(printTree(q));
    }

    public String printTree(TreeNode p) {
        if (p == null) {
            return "";
        }
        TreeNode emptyNode = new TreeNode(1992091200);
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(p);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == 1992091200) {
                sb.append("null").append(" ");
                continue;
            } else {
                sb.append(node.val).append(" ");

            }
            if (node.left != null) {
                queue.add(node.left);
            } else {
                queue.add(emptyNode);
            }

            if (node.right != null) {
                queue.add(node.right);
            } else {
                queue.add(emptyNode);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem100 problem100 = new Problem100();
        TreeNode tree = TreeNode.build(new Integer[] {1,2,3,4,null,null,5});
        System.out.println(problem100.printTree(tree));
    }


}
