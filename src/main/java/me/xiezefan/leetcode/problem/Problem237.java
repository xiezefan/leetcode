package me.xiezefan.leetcode.problem;

import me.xiezefan.leetcode.entity.ListNode;

/**
 * Problem Delete node int a linked list
 * Link:https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Created by xiezefan on 15/9/5.
 */
public class Problem237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
