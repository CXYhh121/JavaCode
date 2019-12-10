package ListOj;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        //边界值判断
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(head.val);
        while(head.next != null) {
            ListNode node = new ListNode(head.next.val);
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }
}
