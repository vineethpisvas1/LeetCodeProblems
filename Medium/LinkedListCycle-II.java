/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode slow=head, fast=head;
        slow = slow.next;
        fast = fast.next.next;
        boolean hasCycle = false;
        while(slow!=null && fast!=null && fast.next!=null) {
            if(slow==fast) {
                hasCycle = true;
                break; 
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(hasCycle) {
            slow=head;
            while(slow!=fast) {
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        return null;
    }
}