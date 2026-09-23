# Roman to Integer

**Difficulty:** Easy  
**Topics:** Hash Table, Math, String  
**LeetCode URL:** [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## Problem Description

<p>Roman numerals are represented by seven different symbols:&nbsp;<code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.</p>

<pre>
<strong>Symbol</strong>       <strong>Value</strong>
I             1
V             5
X             10
L             50
C             100
D             500
M             1000</pre>

<p>For example,&nbsp;<code>2</code> is written as <code>II</code>&nbsp;in Roman numeral, just two ones added together. <code>12</code> is written as&nbsp;<code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.</p>

<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>

<ul>
	<li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.&nbsp;</li>
	<li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.&nbsp;</li>
	<li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
</ul>

<p>Given a roman numeral, convert it to an integer.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;III&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> III = 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;LVIII&quot;
<strong>Output:</strong> 58
<strong>Explanation:</strong> L = 50, V= 5, III = 3.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;MCMXCIV&quot;
<strong>Output:</strong> 1994
<strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 15</code></li>
	<li><code>s</code> contains only&nbsp;the characters <code>(&#39;I&#39;, &#39;V&#39;, &#39;X&#39;, &#39;L&#39;, &#39;C&#39;, &#39;D&#39;, &#39;M&#39;)</code>.</li>
	<li>It is <strong>guaranteed</strong>&nbsp;that <code>s</code> is a valid roman numeral in the range <code>[1, 3999]</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int romanToInt(String str) {
        int sum = 0;
        char[] s = str.toCharArray();
        for(int i = 0;i<s.length; i++){
            if(s[i] == ('M')){
                sum += 1000;
            }
            else if(s[i]==('D')){
                sum += 500;
            }
            else if(s[i]==('C')){
                if((i+1) < s.length && s[i+1]==('D')){
                    sum+=400;
                    i++;
                }
                else if((i+1) < s.length && s[i+1]==('M')){
                    sum+=900;
                    i++;
                }
                else{
                    sum+=100;
                }
            }
            else if(s[i]==('L')){
                sum+= 50;
            }
            else if(s[i]==('X')){
                if((i+1)<s.length && s[i+1]==('L')){
                    sum+=40;
                    i++;
                }
                else if((i+1)<s.length &&s[i+1]==('C')){
                    sum+=90;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(s[i]==('V')){
                sum+=5;
            }
            else{
                if((i+1) < s.length && s[i+1]==('V')){
                    sum+=4;
                    i++;
                }
                else if((i+1) < s.length && s[i+1]==('X')){
                    sum+=9;
                    i++;
                }
                else{
                    sum+=1;
                }
            }
        }
        return sum;
    }

}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
