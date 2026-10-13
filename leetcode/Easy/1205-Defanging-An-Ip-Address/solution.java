// LeetCode Problem: Defanging an IP Address
// Link: https://leetcode.com/problems/defanging-an-ip-address/
// Difficulty: Easy
// Language: java

class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for(char ch:address.toCharArray()){
            if(ch == '.'){
                res+=""+"[.]";
            }
            else{
                res+=""+ch;
            }
        }
        return res;
    }
}