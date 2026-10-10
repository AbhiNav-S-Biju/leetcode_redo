// LeetCode Problem: Richest Customer Wealth
// Link: https://leetcode.com/problems/richest-customer-wealth/
// Difficulty: Easy
// Language: java

class Solution {
    public int maximumWealth(int[][] accounts) {
        int highest = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum +=accounts[i][j];
            }
            highest = Math.max(highest, sum);
        }
        return highest;
    }
}