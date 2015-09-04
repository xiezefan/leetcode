package me.xiezefan.leetcode.problem;

/**
 * Add two number
 * Link:https://leetcode.com/problems/add-two-numbers/
 * Created by xiezefan on 15/9/4.
 */
public class Problem2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = null;
        ListNode result = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int ll1 = l1 == null ? 0 : l1.val;
            int ll2 = l2 == null ? 0 : l2.val;
            int sum = ll1 + ll2 + carry;
            if (sum >= 10) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            if (node == null){
                result = node = new ListNode(sum);
            } else {
                node.next = new ListNode(sum);
                node = node.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (carry != 0) {
            node.next = new ListNode(1);
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode buildListNode(int num) {
        ListNode node = null;
        ListNode result = null;
        int index = 10;
        do {
            if (node == null) {
                node = new ListNode(num % index);
                result = node;
            } else {
                node.next = new ListNode(num % index);
                node = node.next;
            }
            num /= 10;

        } while (num != 0);
        return result;
    }

    public void printListNode(ListNode listNode) {
        System.out.print("{");
        while(listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        problem2.printListNode(problem2.addTwoNumbers(problem2.buildListNode(9), problem2.buildListNode(9999991)));
    }


}
