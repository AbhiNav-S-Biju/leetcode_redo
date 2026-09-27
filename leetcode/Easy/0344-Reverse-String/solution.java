// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: java

class Solution {
    public void reverseString(char[] s) {
        int index = 0;
        for(int i = 0; i<s.length/2;i++){
            char tem = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tem;
        }
    }
}