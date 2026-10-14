// LeetCode Problem: String to Integer (atoi)
// Link: https://leetcode.com/problems/string-to-integer-atoi/
// Difficulty: Medium
// Language: java

class Solution {
    public int myAtoi(String s) {
        long res = 0;
        s = s.trim();
        int sign = +1;
        char[] sc = s.toCharArray();
        for(int i = 0; i<sc.length;i++){
            if(i == 0 && (sc[i]=='-')){
                sign = -1;
                
            }
            else if(i == 0 &&(sc[i]=='+')){
                continue;
            }
            else if((sc[i]>='0'&& sc[i]<='9')){
                int digit = sc[i]-'0';
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = (res*10)+digit;
            }
            else{
                break;
            }
        }
        return (int)(sign*res);
    }
}