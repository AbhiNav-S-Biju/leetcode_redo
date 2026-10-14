// LeetCode Problem: Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseWords(String s) {
        String[] s_arr = s.split(" ");
        String res = "";
        for(String words:s_arr){
            char[] wc = words.toCharArray();
            int l = 0;
            int r = wc.length-1;
            while(l<r){
                char temp = wc[l];
                wc[l] = wc[r];
                wc[r] = temp;
                l++;
                r--;
            }
            res += String.valueOf(wc)+' ';
        }
        return res.substring(0,res.length()-1);
    }
}