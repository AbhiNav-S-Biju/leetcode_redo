// LeetCode Problem: Determine if String Halves Are Alike
// Link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char[] sc = s.toCharArray();
        int a_count = 0;
        int b_count = 0;
        for(int i = 0; i<sc.length/2;i++){
            if(sc[i]=='a'||sc[i]=='e'||sc[i]=='i'||sc[i]=='o'||sc[i]=='u'){
                a_count++;
            }
        }
        for(int i = sc.length/2; i<sc.length;i++){
            if(sc[i]=='a'||sc[i]=='e'||sc[i]=='i'||sc[i]=='o'||sc[i]=='u'){
                b_count++;
            }
        }
        if(a_count == b_count){
            return true;
        }
        return false;
    }
}