
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head !=null){
            if(head.val == val){
                head=head.next;
            }
            else{
                temp.next=head;
                head=head.next;
                temp=temp.next;
            }
        }
        temp.next=null;
        return dummy.next;
    }
}