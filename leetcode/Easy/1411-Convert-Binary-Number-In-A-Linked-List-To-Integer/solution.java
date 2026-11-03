// LeetCode Problem: Convert Binary Number in a Linked List to Integer
// Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode temp = head;
        while(temp != null){
            res = res*2 + temp.val;
            temp = temp.next;
        }
        return res;
    }
}