// LeetCode Problem: Jewels and Stones
// Link: https://leetcode.com/problems/jewels-and-stones/
// Difficulty: Easy
// Language: java

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jc = jewels.toCharArray();
        char[] sc = stones.toCharArray();
        for(char i:jc){
            for(char j:sc){
                if(i==j){
                    count++;
                }
            }
        }
        return count;
    }
}