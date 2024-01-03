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
    public ListNode removeElements(ListNode head, int val) {
        /*if(head.val==val && head.next==null){
            head=head.next;
            return head;
        }
        else if(head==null || head.next==null){
            return head;
        }
        ListNode p=head.next;
        do{
            if(head.val==val){
                head=head.next;
                p=head;
            }
            else if(head.val!=val && head.next==null){
                break;
            }
            else if(p.next!=null){
                ListNode prev=p;    
                p=p.next;
                if(p.val==val){
                    prev.next=p.next;
                }
            }

        }while(head!=null || p!=null);
        return head;*/
        while(head!=null){
            if(head.val==val){
                head=head.next;
            }
            else{
                break;
            }
        }
       if(head!=null){
           ListNode p=head;
           ListNode q=head;
           while(p!=null && p.next!=null){
               if(p.next.val!=val){
                   q.next=p.next;
                   q=q.next;
               }
               p=p.next;
           }
           if(q.next!=null && q.next.val==val){
               q.next=null;
           }
       }
       return head;
    }
}
