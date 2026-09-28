// LeetCode Problem: To Lower Case
// Link: https://leetcode.com/problems/to-lower-case/
// Difficulty: Easy
// Language: java

class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        String ns = new String(ch);
        return ns;
    }
}