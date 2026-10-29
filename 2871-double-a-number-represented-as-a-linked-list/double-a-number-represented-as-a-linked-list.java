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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int carry = 0;
        while(curr != null){
            int value = curr.val;
            int sum = value+value+carry;
            int digit = sum % 10;
            curr.val = digit;
            carry = sum/10;

            if(curr.next == null && carry > 0){
                curr.next = new ListNode(carry);
                carry = 0;
                break;
            }
            curr = curr.next;
        }
        head = reverse(head);
        return head;
    }
}