// LeetCode Problem: Middle of the Linked List
// Link: https://leetcode.com/problems/middle-of-the-linked-list/
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
    public ListNode middleNode(ListNode head) {
        ListNode res = head;
        ListNode tra = head;
        while(tra != null && tra.next !=null){
            res = res.next;
            tra = tra.next.next;
        }
        return res;
    }
}