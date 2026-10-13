// LeetCode Problem: Defanging an IP Address
// Link: https://leetcode.com/problems/defanging-an-ip-address/
// Difficulty: Easy
// Language: java

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}