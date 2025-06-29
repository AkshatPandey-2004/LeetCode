class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){return head;}
        ListNode p=head.next;
        head.next=null;
        while(p!=null){
            ListNode q=p.next;
            p.next=head;
            head=p;
            p=q;
        }
        return head;
    }
}