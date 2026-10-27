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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        // find the length
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        // find size of each part and extra
        int base = n/k;
        int extra = n%k;

        ListNode prev = null;
        ListNode curr = head;
        for(int i=0;i<k;i++){
            // imp part
            if(curr == null){
                ans[i] = curr;
                continue;
            }
            // insert curr into array
            ans[i] = curr;
            // width of curr sublist
            int width = base + (extra > 0 ? 1:0);
            extra--;
            for(int j=0;j<width;j++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            //next iteration
            prev = null;
        }
        return ans;
    }
}