package com.tolik.chellange75;

public class DeletetheMiddleNodeofaLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head;
        ListNode deleted = null;
            while (first.next != null && first.next.next != null) {
                first = first.next.next;
                deleted = second;
                second = second.next;
            }
            if(deleted != null){
                deleted.next = second.next;
            }
        return head;
    }


}
