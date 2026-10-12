// LeetCode Problem: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        for(int i = 0; i<2*nums.length;i++){
            res[i] = nums[i%nums.length];
        }
        return res;
    }
}