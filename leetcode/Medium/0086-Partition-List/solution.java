// LeetCode Problem: Partition List
// Link: https://leetcode.com/problems/partition-list/
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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode higher = new ListNode(0);
        ListNode lower = new ListNode(0);
        ListNode head_low = lower;
        ListNode head_high = higher;
        while(temp != null){
            if(temp.val < x){
                lower.next = temp;
                lower = lower.next;
            }else{
                higher.next = temp;
                higher = higher.next;
            }
            temp = temp.next;
            
        }
        higher.next = null;
        lower.next = head_high.next;
        return head_low.next;
    }

}