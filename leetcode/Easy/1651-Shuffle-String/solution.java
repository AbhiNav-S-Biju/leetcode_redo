// LeetCode Problem: Shuffle String
// Link: https://leetcode.com/problems/shuffle-string/
// Difficulty: Easy
// Language: java

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        char[] sc = s.toCharArray();
        int count = 0;
        for(int i:indices){
            res[i]=sc[count++];
        }
        return new String(res);
    }
}