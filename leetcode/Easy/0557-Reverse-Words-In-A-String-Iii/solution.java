// LeetCode Problem: Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            sb.append(word.reverse());
            sb.append(" ");
        }
        String ans = sb.toString();
        return ans.substring(0,ans.length()-1);
    }
}