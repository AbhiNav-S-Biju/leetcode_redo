// LeetCode Problem: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Language: java

class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0 ;
        s = s.strip();
        s = ' '+s;
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length;i++){
            if(ch[i] == ' '&&ch[i+1]!=' ')
                index = i;
        }
        if(ch.length == 1)
            return 1;
        return ch.length-index-1;
    }
}