// LeetCode Problem: Maximum Twin Sum of a Linked List
// Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
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
    public int pairSum(ListNode head) {
        int max = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode nexttemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexttemp;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            max = Math.max(first.val+second.val, max);
            second = second.next;
            first = first.next;
            
        }
        return max;
    }
}