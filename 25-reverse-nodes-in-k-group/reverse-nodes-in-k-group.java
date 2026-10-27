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
    public ListNode reverseKGroup(ListNode head, int k) {
        //length of ll 
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        //base case of recursion
        if(len<k){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(int i=0;i<k;i++){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        // recursive call
        ListNode recHead = reverseKGroup(curr, k);
        // join both lists
        head.next = recHead;
        return prev;
    }
}