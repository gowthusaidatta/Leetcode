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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val == 0) return l2;
        if(l2.val == 0) return l1;

        // reversed lists
        ListNode rl1 = reverse(l1);
        ListNode rl2 = reverse(l2);

        int carry =0;
        ListNode dhead = new ListNode(0);
        ListNode temp = dhead;
        while(rl1 != null || rl2 != null || carry > 0){

            int sum = carry;
            if(rl1 != null){
                sum += rl1.val;
                rl1 = rl1.next;
            }
            if(rl2 != null){
                sum += rl2.val;
                rl2 = rl2.next;
            }

            carry = sum /10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            
            

        }
        
        
        return reverse(dhead.next);
    }
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(head != null){

            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;
    }
}