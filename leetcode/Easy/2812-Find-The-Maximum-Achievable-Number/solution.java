// LeetCode Problem: Find the Maximum Achievable Number
// Link: https://leetcode.com/problems/find-the-maximum-achievable-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        for(int i = 0; i<t*2;i++){
            num++;
        }
        return num;
    }
}