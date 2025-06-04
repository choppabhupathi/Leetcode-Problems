class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; 
        }
        ListNode tail = head;
        int length = 1; 
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head; 
        k = k % length; 
        if (k == 0) {
            tail.next = null; 
            return head;
        }
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next; 
        }
        ListNode newHead = newTail.next; 
        newTail.next = null; 
        return newHead;
    }
}