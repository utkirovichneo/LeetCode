package com.tolik.chellange75;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode list1 = null;
        ListNode list2 = head;
        while (list2 != null) {
            ListNode nextTemp = list2.next;
            list2.next = list1;
            list1 = list2;
            list2 = nextTemp;
        }
        return list1;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
