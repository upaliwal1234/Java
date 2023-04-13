// 148. Sort List
// Medium
// Companies
// Given the head of a linked list, return the list after sorting it in ascending order.

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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode midnext = mid.next;
        mid.next = null;
        ListNode A = sortList(head);
        ListNode B = sortList(midnext);
        return mergeTwoLists(A, B);
    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
