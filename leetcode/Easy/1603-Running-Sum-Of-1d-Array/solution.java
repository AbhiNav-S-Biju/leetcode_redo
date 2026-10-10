// LeetCode Problem: Running Sum of 1d Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum_arr = new int[nums.length];
        int sum = 0;
        int count = 0;
        for(int i:nums){
            sum+=i;
            sum_arr[count] = sum;
            count++;
        }
        return sum_arr;
    }
}