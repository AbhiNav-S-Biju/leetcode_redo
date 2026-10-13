// LeetCode Problem: Count the Number of Consistent Strings
// Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
// Difficulty: Easy
// Language: java

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int flag = 0;
        char[] ac = allowed.toCharArray();
        int count = 0;
        for(String w:words){
            flag = 0;
            for(char xw:w.toCharArray()){
                if(allowed.indexOf(xw)==-1){
                    flag = -1;
                    break;
                }
            }
            if(flag!=-1){
                count++;
            }
        }
        return count;
    }
}