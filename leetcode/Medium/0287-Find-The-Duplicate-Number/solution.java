// LeetCode Problem: Find the Duplicate Number
// Link: https://leetcode.com/problems/find-the-duplicate-number/
// Difficulty: Medium
// Language: java

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            
            }
        }
        return -1;
    }
}