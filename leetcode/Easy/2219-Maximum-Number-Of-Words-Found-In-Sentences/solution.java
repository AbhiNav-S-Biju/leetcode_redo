// LeetCode Problem: Maximum Number of Words Found in Sentences
// Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
// Difficulty: Easy
// Language: java

class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int max_count = 0;
        for(String s:sentences){
            for(String words:s.split(" ")){
                count++;
            }
            if(count>max_count){
                max_count = count;
            }
            count = 0;
        }
        return max_count;
    }
}