// 445. Add Two Numbers II
// Medium
// 5.7K
// 279
// Companies
// You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.


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
    public ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {
        ListNode l1 = reverse(ll1);
        ListNode l2 = reverse(ll2);
        ListNode nn = new ListNode();
        ListNode rv = nn;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            ListNode temp = new ListNode();
            temp.val = sum%10;
            rv.next = temp;
            rv = rv.next;
        }
        return reverse(nn.next);
    }

    public static ListNode reverse(ListNode ll){
        ListNode nn = null, temp;
        while(ll != null){
            temp = ll.next;
            ll.next = nn;
            nn = ll;
            ll = temp;
        }
        return nn;
    }
}
