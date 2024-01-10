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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p=head.next;
        head.next=p.next;
        p.next=head;
        head=p;
        p=p.next;
        while(p.next!=null){
            if(p.next.next==null){
                break;
           }
            ListNode q=p.next;
            p.next=p.next.next;
            p=p.next;
            //if(q.next!=null)
            q.next=p.next;
            //if(p.next!=null)
            p.next=q;
            p=q;
            }
        return head;
    }
}
