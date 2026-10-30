// LeetCode Problem: Custom Sort String
// Link: https://leetcode.com/problems/custom-sort-string/
// Difficulty: Medium
// Language: java

class Solution {
    public String customSortString(String order, String s) {
        String res = "";
        char[] oc = order.toCharArray();
        char[] sc = s.toCharArray();
        for(int i = 0;i<oc.length;i++){
            for(int j = 0; j<sc.length;j++){
                if(oc[i]==sc[j]){
                    res += sc[j];
                    sc[j] = ' ';
                }
            }
        }
        for(int i = 0; i<sc.length; i++){
            if(sc[i]!=' '){
                res+=sc[i];
            }
        }
        return res;
    }
}