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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode r=head;
        ListNode p = head.next;
        ListNode q = head;
        do{

            if(head.val != p.val){
                
                head.next=q.next;
                head=p;
            }
            else if(head.val==p.val){
                head.next=null;
            }
            q=p;
            p=p.next;
        }while(p!=null);

        return r;
    }
}
