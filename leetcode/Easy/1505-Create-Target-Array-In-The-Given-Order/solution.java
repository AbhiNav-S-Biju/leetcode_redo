// LeetCode Problem: Create Target Array in the Given Order
// Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        int length = 0;
        for(int i = 0; i<nums.length;i++){
            if(length!=0){
                int j = length;
                while(j>index[i]){
                    res[j] = res[j-1];
                    j--;
                }
            }
            res[index[i]] = nums[i];
            length++;
        }
        return res;
    }
}