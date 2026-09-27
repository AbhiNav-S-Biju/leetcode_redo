// LeetCode Problem: Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int strStr(String haystackS, String needleS) {
        int flag = 1;
        char[] haystack = haystackS.toCharArray();
        char[] needle = needleS.toCharArray();
        if(haystack.length<needle.length)
            return -1;
        for(int i =0; i<=haystack.length-needle.length;i++){
            if(haystack[i] == needle[0]){
                int j;
                for(j = 0; j<needle.length; j++){
                    if(haystack[i+j] != needle[j]){
                        break;
                    }
                }
                if(j == needle.length){
                    return i;
                }
            }
        }
        return -1;
    }
}