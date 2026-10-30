// LeetCode Problem: Reverse Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/
// Difficulty: Easy
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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        head.next = null;
        while(temp != null){
            ListNode t = temp;
            temp = temp.next;
            t.next = prev;
            prev = t;
        }
        return prev;
    }
}