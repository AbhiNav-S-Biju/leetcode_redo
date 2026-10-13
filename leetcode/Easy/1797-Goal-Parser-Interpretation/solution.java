// LeetCode Problem: Goal Parser Interpretation
// Link: https://leetcode.com/problems/goal-parser-interpretation/
// Difficulty: Easy
// Language: java

class Solution {
    public String interpret(String command) {
        char[] sc = command.toCharArray();
        String s = "";
        for(int i = 0; i<sc.length;i++){
            if(sc[i] == '('&& sc[i+1]==')'){
                s+= ""+'o';
            }else if(sc[i]!=')'&&sc[i]!='('){
                s+=""+sc[i];
            }
        }
        return s;
    }
}