/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode ref = head;
        while(ref.next!=null){
            if(ref.val<=ref.next.val){
                ref = ref.next;
                continue;
            }
            int temp = ref.next.val;
            ref.next = ref.next.next;
            ListNode iref = head;
            if(head.val > temp){
                ListNode tt = new ListNode(temp);
                tt.next = head;
                head = tt;
            }
            else{
            while(iref.next!=null && temp>iref.next.val){
                iref = iref.next;

            }
            ListNode tt = new ListNode(temp);
            tt.next = iref.next;
            iref.next = tt;
            }
            ref = head;
        }
        return head;
    }
}