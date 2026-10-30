// LeetCode Problem: Isomorphic Strings
// Link: https://leetcode.com/problems/isomorphic-strings/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for(int i = 0; i<sc.length;i++){
            for(int j = i; j<sc.length; j++){
                if((sc[i]==sc[j]&&tc[i]!=tc[j])||(tc[i]==tc[j]&&sc[i]!=sc[j])){
                    return false;
                }
            }
        }
        return true;
    }
}