package com.tolik.problems;

public class InsertGreatestCommonDivisorsinLinkedList {
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            if (head == null || head.next == null)
                return head;
            while (head.next != null) {
                int a = head.val;
                int b = head.next.val;
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                var temp = new ListNode(a);
                temp.next = head.next;
                head.next = temp;
                head = head.next;
            }
            return null;
        }

        class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
