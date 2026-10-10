// LeetCode Problem: Build Array from Permutation
// Link: https://leetcode.com/problems/build-array-from-permutation/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i:nums){
            arr[count] = nums[i]; 
            count++;
        }
        return arr;
    }
}