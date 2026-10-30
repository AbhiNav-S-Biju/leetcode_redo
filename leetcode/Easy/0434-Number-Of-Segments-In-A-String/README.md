# Number of Segments in a String

**Difficulty:** Easy  
**Topics:** String  
**LeetCode URL:** [Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/)

## Problem Description

<p>Given a string <code>s</code>, return <em>the number of segments in the string</em>.</p>

<p>A <strong>segment</strong> is defined to be a contiguous sequence of <strong>non-space characters</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;Hello, my name is John&quot;
<strong>Output:</strong> 5
<strong>Explanation:</strong> The five segments are [&quot;Hello,&quot;, &quot;my&quot;, &quot;name&quot;, &quot;is&quot;, &quot;John&quot;]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;Hello&quot;
<strong>Output:</strong> 1
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 300</code></li>
	<li><code>s</code> consists of lowercase and uppercase English letters, digits, or one of the following characters <code>&quot;!@#$%^&amp;*()_+-=&#39;,.:&quot;</code>.</li>
	<li>The only space character in <code>s</code> is <code>&#39; &#39;</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Number of Segments in a String
// Link: https://leetcode.com/problems/number-of-segments-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.length() == 0)
            return 0;
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length-1;i++){
            if(ch[i] == ' ' && ch[i+1]!=' '){
                count++;
            }
        }
        return count+1;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
