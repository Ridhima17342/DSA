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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int i=0;
        List<Integer> critical = new ArrayList<>();
        while(curr != null && curr.next != null){
            //local maxima
            if(curr.val > prev.val && curr.val > curr.next.val){
                critical.add(i);
            }
            //local minima
            if(curr.val < prev.val && curr.val < curr.next.val){
                critical.add(i);
            }
            curr = curr.next;
            prev = prev.next;
            i++;
        }
        if(critical.size()<2){
            return new int[]{-1,-1};
        }
        
        int min = Integer.MAX_VALUE;
        for(int j=1;j<critical.size();j++){
            min = Math.min(min,critical.get(j)-critical.get(j-1));
        }
        int max = critical.get(critical.size()-1) - critical.get(0);
        return new int[]{min,max};
    }
}