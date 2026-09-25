// LeetCode Problem: Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Difficulty: Easy
// Language: java

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i:nums){
            if(i != val){
                nums[count] = i;
                count++;
            }
        }
        return count;
    }
}