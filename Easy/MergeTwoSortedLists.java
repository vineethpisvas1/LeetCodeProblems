/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        if(l1==null) {
            return l2;
        } else if(l2==null) {
            return l1;
        }
        while(l1!=null || l2!=null) {
            if(l1!=null && (l2==null || l1.val<=l2.val)) {
                temp.next=l1;
                l1 = l1.next;
                temp = temp.next;
            } else if(l2!=null) {
                temp.next=l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        return head.next;
    }
}