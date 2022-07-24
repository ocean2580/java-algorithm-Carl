package ocean.linkedlist.leetcode;

import ocean.linkedlist.template.MySingleLinkedList;

public class RemoveNthFromEnd {
    /** 删除链表的倒数位节点 */
    // 快慢指针
    public MySingleLinkedList.ListNode removeNthFromEnd(MySingleLinkedList.ListNode head, int n) {
        MySingleLinkedList.ListNode dummy = new MySingleLinkedList.ListNode(-1);
        dummy.next = head;

        MySingleLinkedList.ListNode slow = dummy;
        MySingleLinkedList.ListNode fast = dummy;
        while (n-- > 0) {   // 参考系
            fast = fast.next;
        }
        // 记住 待删除节点slow 的上一节点
        MySingleLinkedList.ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        // 上一节点的next指针绕过 待删除节点slow 直接指向slow的下一节点
        prev.next = slow.next;

        return dummy.next;
    }
}
