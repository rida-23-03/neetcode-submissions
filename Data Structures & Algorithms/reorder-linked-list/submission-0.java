class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr=slow.next;
        ListNode prev=null;
        ListNode front=null;
        slow.next=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        ListNode first=head;
        ListNode sec=prev;
        while(sec!=null){
            ListNode t1=first.next;
            ListNode t2=sec.next;

            first.next=sec;
            sec.next=t1;

            first=t1;
            sec=t2;
        }
    }
}