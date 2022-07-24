package ocean.linkedlist.leetcode;

import ocean.linkedlist.template.MySingleLinkedList;

public class DetectCycle {
    /** 环形链表*/
    public MySingleLinkedList.ListNode detectCycle(MySingleLinkedList.ListNode head) {
        MySingleLinkedList.ListNode slow = head;
        MySingleLinkedList.ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // 有环
                MySingleLinkedList.ListNode index1 = fast;
                MySingleLinkedList.ListNode index2 = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
