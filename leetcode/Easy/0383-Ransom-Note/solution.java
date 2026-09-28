// LeetCode Problem: Ransom Note
// Link: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r_arr = ransomNote.toCharArray();
        char[] m_arr = magazine.toCharArray();
        if(r_arr.length<=m_arr.length){
            for(char ch:m_arr){
                for(int i = 0; i< r_arr.length; i++){
                    if(r_arr[i] == ch){
                        r_arr[i] = '.';
                        break;
                    }
                }
            }
            for(char ch:r_arr){
                if(ch != '.')
                    return false;
            }
            return true;
        }
        return false;
    }
}