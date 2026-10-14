// LeetCode Problem: Check If Two String Arrays are Equivalent
// Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1 = "";
        String res2 = "";
        for(String s:word1){
            res1 +=""+s;
        }
        for(String s:word2){
            res2 += ""+s;
        }
        if(res1.compareTo(res2)==0){
            return true;
        }
        return false;
    }
}