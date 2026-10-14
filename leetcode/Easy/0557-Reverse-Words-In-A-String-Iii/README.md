# Reverse Words in a String III

**Difficulty:** Easy  
**Topics:** Two Pointers, String  
**LeetCode URL:** [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/)

## Problem Description

<p>Given a string <code>s</code>, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;Let&#39;s take LeetCode contest&quot;
<strong>Output:</strong> &quot;s&#39;teL ekat edoCteeL tsetnoc&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;Mr Ding&quot;
<strong>Output:</strong> &quot;rM gniD&quot;
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> contains printable <strong>ASCII</strong> characters.</li>
	<li><code>s</code> does not contain any leading or trailing spaces.</li>
	<li>There is <strong>at least one</strong> word in <code>s</code>.</li>
	<li>All the words in <code>s</code> are separated by a single space.</li>
</ul>

## Solution

```java
// LeetCode Problem: Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseWords(String s) {
        String[] s_arr = s.split(" ");
        String res = "";
        for(String words:s_arr){
            char[] wc = words.toCharArray();
            int l = 0;
            int r = wc.length-1;
            while(l<r){
                char temp = wc[l];
                wc[l] = wc[r];
                wc[r] = temp;
                l++;
                r--;
            }
            res += String.valueOf(wc)+' ';
        }
        return res.substring(0,res.length()-1);
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
