// 160. Intersection of Two Linked Lists
// Easy
// Companies
// Given the heads of two singly linked-lists headA and headB,
// return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
// For example, the following two linked lists begin to intersect at node c1:

// The test cases are generated such that there are no cycles anywhere in the entire linked structure.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while(A!=B){
            if(A == null){
                A = headB;
            }
            else{
                A = A.next;
            }
            if(B == null){
                B = headA;
            }
            else{
                B = B.next;
            }
        }
        return A;
    }
}
