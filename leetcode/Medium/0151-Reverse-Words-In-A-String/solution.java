// LeetCode Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/
// Difficulty: Medium
// Language: java

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s= s+" .";
        char[] ch = s.toCharArray();

        String res= "";
        String word = "";
        for(int i = 0; i<ch.length;i++){
            if(ch[i]==' '&&ch[i+1]!=' '){
                res = " " +word +res;
                word = "";
            }else if(ch[i]!=' '){
                word+=""+ch[i];
            }else{
                continue;
            }
        }
        return res.trim();
    }
}