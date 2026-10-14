// LeetCode Problem: Truncate Sentence
// Link: https://leetcode.com/problems/truncate-sentence/
// Difficulty: Easy
// Language: java

class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        String res[]= new String[k];
        for(String words:s.split(" ")){
            res[count]=words;
            count++;
            if(count==k){
                break;
            }
        }
        return String.join(" ", res);
    }
}