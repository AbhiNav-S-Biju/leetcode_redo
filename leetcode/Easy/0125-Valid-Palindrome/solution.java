// LeetCode Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(String s) {
        String ns = "";
        s = s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(ch>='a'&&ch<='z' || ch>='0'&&ch<='9')
                ns+=ch;
        }
        char[] nch = ns.toCharArray();
        for(int i = 0; i<nch.length;i++){
            if(nch[i]!=nch[nch.length-i-1]){
                return false;
            }
        }
        return true;
    }
}