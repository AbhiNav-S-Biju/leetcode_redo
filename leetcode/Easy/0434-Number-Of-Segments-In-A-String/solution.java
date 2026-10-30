// LeetCode Problem: Number of Segments in a String
// Link: https://leetcode.com/problems/number-of-segments-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.length() == 0)
            return 0;
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length-1;i++){
            if(ch[i] == ' ' && ch[i+1]!=' '){
                count++;
            }
        }
        return count+1;
    }
}