// LeetCode Problem: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Language: java

class Solution {
    public void rotate(int[] nums, int k) {
        int rot = k%nums.length;
        int count = 0;
        int[] res = new int[nums.length];
        for(int i = nums.length-rot;i<nums.length;i++){
            res[count++] =nums[i]; 
        }
        for(int i = 0; i< nums.length-rot;i++){
            res[count] = nums[i];
            count++;
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = res[i];
        }
    }
}