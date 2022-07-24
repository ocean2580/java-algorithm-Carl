package ocean.linkedlist.leetcode;

import ocean.linkedlist.template.MySingleLinkedList;

public class ReverseList {
    /** 双指针反转链表（纸上画出过程）*/
    // 改变链表的next指针的指向
    public MySingleLinkedList.ListNode reverseList(MySingleLinkedList.ListNode head) {
        MySingleLinkedList.ListNode prev = null;
        MySingleLinkedList.ListNode cur = head;
        MySingleLinkedList.ListNode temp = null;
        while (cur != null) {
            temp = cur.next;// 保存下一个节点
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
