// LeetCode Problem: Goal Parser Interpretation
// Link: https://leetcode.com/problems/goal-parser-interpretation/
// Difficulty: Easy
// Language: java

class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)","al");
    }
}