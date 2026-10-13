# Count the Number of Consistent Strings

**Difficulty:** Easy  
**Topics:** Array, Hash Table, String, Bit Manipulation, Counting  
**LeetCode URL:** [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/)

## Problem Description

<p>You are given a string <code>allowed</code> consisting of <strong>distinct</strong> characters and an array of strings <code>words</code>. A string is <strong>consistent </strong>if all characters in the string appear in the string <code>allowed</code>.</p>

<p>Return<em> the number of <strong>consistent</strong> strings in the array </em><code>words</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> allowed = &quot;ab&quot;, words = [&quot;ad&quot;,&quot;bd&quot;,&quot;aaab&quot;,&quot;baa&quot;,&quot;badab&quot;]
<strong>Output:</strong> 2
<strong>Explanation:</strong> Strings &quot;aaab&quot; and &quot;baa&quot; are consistent since they only contain characters &#39;a&#39; and &#39;b&#39;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> allowed = &quot;abc&quot;, words = [&quot;a&quot;,&quot;b&quot;,&quot;c&quot;,&quot;ab&quot;,&quot;ac&quot;,&quot;bc&quot;,&quot;abc&quot;]
<strong>Output:</strong> 7
<strong>Explanation:</strong> All strings are consistent.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> allowed = &quot;cad&quot;, words = [&quot;cc&quot;,&quot;acd&quot;,&quot;b&quot;,&quot;ba&quot;,&quot;bac&quot;,&quot;bad&quot;,&quot;ac&quot;,&quot;d&quot;]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Strings &quot;cc&quot;, &quot;acd&quot;, &quot;ac&quot;, and &quot;d&quot; are consistent.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= allowed.length &lt;=<sup> </sup>26</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 10</code></li>
	<li>The characters in <code>allowed</code> are <strong>distinct</strong>.</li>
	<li><code>words[i]</code> and <code>allowed</code> contain only lowercase English letters.</li>
</ul>

## Solution

```java
// LeetCode Problem: Count the Number of Consistent Strings
// Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
// Difficulty: Easy
// Language: java

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int flag = 0;
        char[] ac = allowed.toCharArray();
        int count = 0;
        for(String w:words){
            flag = 0;
            for(char xw:w.toCharArray()){
                if(allowed.indexOf(xw)==-1){
                    flag = -1;
                    break;
                }
            }
            if(flag!=-1){
                count++;
            }
        }
        return count;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
