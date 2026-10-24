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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode();
        ListNode lessTail = lessHead;

        ListNode moreHead = new ListNode();
        ListNode moreTail = moreHead;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode node = temp;
                temp = temp.next; 
                lessTail.next = node;
                lessTail = node;
            }
            else{
                ListNode node = temp;
                temp = temp.next; 
                moreTail.next = node;
                moreTail = node;
            }
        }
        lessTail.next = moreHead.next;
        moreTail.next = null;

        return lessHead.next;
    }
}