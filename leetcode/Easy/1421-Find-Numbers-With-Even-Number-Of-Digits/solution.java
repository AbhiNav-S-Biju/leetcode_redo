// LeetCode Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int findNumbers(int[] nums) {
        int e_count = 0;
        for(int i:nums){
            int count = 0;
            while(i>0){
                int r = i%10;
                count++;
                i /=10;
            }
            if(count%2 == 0)
                e_count++;
        }
        return e_count;
    }
}