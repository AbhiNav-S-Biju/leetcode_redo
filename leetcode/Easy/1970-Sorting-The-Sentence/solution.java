// LeetCode Problem: Sorting the Sentence
// Link: https://leetcode.com/problems/sorting-the-sentence/
// Difficulty: Easy
// Language: java

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res_arr = new String[words.length];
        for(String word:words){
            char[] wc = word.toCharArray();
            int len = wc[wc.length-1]-'0';
            res_arr[len-1] = word.substring(0,wc.length-1);
        }
        return String.join(" ",res_arr);     
    }
}