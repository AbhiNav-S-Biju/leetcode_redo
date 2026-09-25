// LeetCode Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
        int count = 1;
        for(int i:nums){
            if(i>num){
                num = i;
                nums[count] = i;
                count++;
            }
        }
        for(int i = count; i<nums.length;i++){
            nums[i] = 0;
        }
        return count;
    }
}