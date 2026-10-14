# Reverse Vowels of a String

**Difficulty:** Easy  
**Topics:** Two Pointers, String  
**LeetCode URL:** [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

## Problem Description

<p>Given a string <code>s</code>, reverse only all the vowels in the string and return it.</p>

<p>The vowels are <code>&#39;a&#39;</code>, <code>&#39;e&#39;</code>, <code>&#39;i&#39;</code>, <code>&#39;o&#39;</code>, and <code>&#39;u&#39;</code>, and they can appear in both lower and upper cases, more than once.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;IceCreAm&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;AceCreIm&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>The vowels in <code>s</code> are <code>[&#39;I&#39;, &#39;e&#39;, &#39;e&#39;, &#39;A&#39;]</code>. On reversing the vowels, s becomes <code>&quot;AceCreIm&quot;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;leetcode&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;leotcede&quot;</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 3 * 10<sup>5</sup></code></li>
	<li><code>s</code> consist of <strong>printable ASCII</strong> characters.</li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] sc =s.toCharArray(); 
        
        while(l<r){
            char ch1 = sc[l];
            char ch2 = sc[r];
            if(!(ch1=='A'||ch1 == 'E'||ch1 == 'I'||ch1 == 'O'||ch1 == 'U'||ch1 == 'a'||ch1 == 'e'||ch1 == 'i'||ch1 == 'o'||ch1 == 'u')){
                l++;
            }
            else if(!(ch2=='A'||ch2 == 'E'||ch2 == 'I'||ch2 == 'O'||ch2 == 'U'||ch2 == 'a'||ch2 == 'e'||ch2 == 'i'||ch2 == 'o'||ch2 == 'u')){
                r--;
            }
            else{
                char temp = sc[l];
                sc[l] = sc[r];
                sc[r] = temp;
                l++;
                r--;
            }

        }
        return String.valueOf(sc);
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
