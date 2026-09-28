// LeetCode Problem: Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        if(s_arr.length == t_arr.length){
            for(char ch:s_arr){
                for(int i = 0; i<t_arr.length;i++){
                    if(ch == t_arr[i]){
                        t_arr[i] = '.';
                        break;
                    }
                }
            }
            for(char ch:t_arr){
                if(ch != '.')
                    return false;
            }
            return true;
        }
        return false;
    }
}