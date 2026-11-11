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
        ListNode curr = head;
        ListNode prevCurr = new ListNode(-90);

        while(curr != null){
            if(curr.val == prevCurr.val){
                prevCurr.next = curr.next;
                curr = curr.next;
            }else {
                prevCurr = curr;
            curr = curr.next;
            
            }
        }

        return head;
    }
}