class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev=null;
        ListNode curr=l1;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        l1=prev;
        prev=null;
        curr=l2;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        l2=prev;
        ListNode t1=l1,t2=l2,l3=null,h3=null;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            if(h3==null){
                h3=l3=nn;
            }
            else{
                l3.next=nn;
                l3=nn;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            if(h3==null){
                h3=l3=nn;
            }
            else{
                l3.next=nn;
                l3=nn;
            }
            l1=l1.next;
            
        }
        while(l2!=null){
            int sum=l2.val+carry;
            carry=sum/10;
            ListNode nn=new ListNode(sum%10);
            if(h3==null){
                h3=l3=nn;
            }
            else{
                l3.next=nn;
                l3=nn;
            }
            l2=l2.next;
        }
        if(carry!=0){
            l3.next=new ListNode(carry);
            l3=l3.next;
        }
        prev=null;
        curr=h3;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
}