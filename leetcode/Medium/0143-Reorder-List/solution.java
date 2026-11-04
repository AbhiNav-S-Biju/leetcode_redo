// LeetCode Problem: Reorder List
// Link: https://leetcode.com/problems/reorder-list/
// Difficulty: Medium
// Language: java

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
    public void reorderList(ListNode head) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        ListNode h_first = first;
        ListNode h_seconf = second;
        ListNode temp = head;
        ListNode mid = head;
        while(temp!=null && temp.next!=null){
            temp = temp.next.next;
            mid = mid.next;
        }
        
        first = head;
        ListNode prev = null;
        temp = mid.next;
        mid.next = null;
        while(temp!=null){
            ListNode temp_next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = temp_next;
        }
        second = prev;

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    
    }
}