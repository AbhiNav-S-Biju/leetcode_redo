// LeetCode Problem: Power of Two
// Link: https://leetcode.com/problems/power-of-two/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>1){
            while(n>1){
                if(n%2 == 0){
                    n = n/2;
                }
                else{
                    return false;
                }

            }
            return true;
        }
        else if(n==1)
            return true;
        return false;
    }
}