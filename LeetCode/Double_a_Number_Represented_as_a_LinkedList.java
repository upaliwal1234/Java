// 2816. Double a Number Represented as a Linked List
// Medium
// 360
// 5
// Companies
// You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.

// Return the head of the linked list after doubling it.

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
    public ListNode doubleIt(ListNode head) {
        ListNode l1 = reverse(head);
        ListNode dummy = new ListNode();
        ListNode node = dummy;
        int c = 0;
        while(l1 != null || c == 1){
            int s = 0;
            if(l1 != null){
                s += l1.val * 2;
                l1 = l1.next;
            }
            s += c;
            c = s / 10;
            dummy.next = new ListNode(s % 10);
            dummy = dummy.next;
        }
        return reverse(node.next);
    }

    private static ListNode reverse(ListNode ll){
        ListNode nn = null;
        ListNode temp = nn;
        while(ll != null){
            temp = ll.next;
            ll.next = nn;
            nn = ll;
            ll = temp;
        }
        return nn;
    }
}
