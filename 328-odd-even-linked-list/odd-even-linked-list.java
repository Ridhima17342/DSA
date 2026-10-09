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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;

        while(evenTail != null && evenTail.next != null){
            // for odd linked list
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            // for even linked list
            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        // combine both the list
        oddTail.next = evenHead;
        return oddHead;
    }
}