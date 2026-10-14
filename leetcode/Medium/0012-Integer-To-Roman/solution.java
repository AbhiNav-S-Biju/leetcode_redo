// LeetCode Problem: Integer to Roman
// Link: https://leetcode.com/problems/integer-to-roman/
// Difficulty: Medium
// Language: java

class Solution {
    public String intToRoman(int num) {
        String res = "";
        while(num>0){
            if(num>=1000){
                int count = num/1000;
                res += "M".repeat(count);
                num = num%1000;
            }else if((int)(num/900) == 1){
                res +="CM";
                num -=900;
            }else if(num>=500){
                int count = num/500;
                res+="D".repeat(count);
                num = num%500;
            }else if((int)(num/400) == 1){
                res+="CD";
                num -= 400;
            }else if(num>=100){
                int count = num/100;
                res+="C".repeat(count);
                num = num%100;
            }else if((int)(num/90)==1){
                res += "XC";
                num -= 90;
            }else if(num>=50){
                int count = num/50;
                res+="L".repeat(count);
                num = num%50;
            }else if((int)(num/40)==1){
                res+="XL";
                num -= 40;
            }else if(num>=10){
                int count = num/10;
                res += "X".repeat(count);
                num = num%10;
            }else if(num == 9){
                res += "IX";
                num -= 9;
            }else if(num >=5){
                int count = num/5;
                res+="V".repeat(count);
                num = num%5;
            }else if(num == 4){
                res+="IV";
                num -= 4;
            }else{
                res+="I".repeat(num);
                num = 0;
            }
            
        }
        return res;
    }
}