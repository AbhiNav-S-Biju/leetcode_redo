// LeetCode Problem: Merge Strings Alternately
// Link: https://leetcode.com/problems/merge-strings-alternately/
// Difficulty: Easy
// Language: java

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        char[] word1_arr = word1.toCharArray();
        char[] word2_arr = word2.toCharArray();
        int i = 0, j = 0;
        while(i<word1_arr.length&&j<word2_arr.length){
            res+=""+(word1_arr[i++]);
            res+=""+(word2_arr[j++]);
        }
        while(i<word1_arr.length){
            res+=""+(word1_arr[i++]);
        }
        while(j<word2_arr.length){
            res+=""+(word2_arr[j++]);
        }
        return res;
    }
}