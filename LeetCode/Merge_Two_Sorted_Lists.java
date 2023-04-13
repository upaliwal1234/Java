// 21. Merge Two Sorted Lists
// Easy
// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     LiqstNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        while(a != null && b != null){
            ListNode node = new ListNode();
            if(a.val < b.val){
                Dummy.next = a;
                Dummy = Dummy.next;
                a = a.next;
            }
            else{
                Dummy.next = b;
                Dummy = Dummy.next;
                b = b.next;
            }
        }
        while(a != null){
            Dummy.next = a;
            Dummy = Dummy.next;
            a = a.next;
        }
        while(b != null){
            Dummy.next = b;
            Dummy = Dummy.next;
            b = b.next;
        }
        return temp.next;
    }
}
