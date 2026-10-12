# Create Target Array in the Given Order

**Difficulty:** Easy  
**Topics:** Array, Simulation  
**LeetCode URL:** [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)

## Problem Description

<p>Given two arrays of integers&nbsp;<code>nums</code> and <code>index</code>. Your task is to create <em>target</em> array under the following rules:</p>

<ul>
	<li>Initially <em>target</em> array is empty.</li>
	<li>From left to right read nums[i] and index[i], insert at index <code>index[i]</code>&nbsp;the value <code>nums[i]</code>&nbsp;in&nbsp;<em>target</em> array.</li>
	<li>Repeat the previous step until there are no elements to read in <code>nums</code> and <code>index.</code></li>
</ul>

<p>Return the <em>target</em> array.</p>

<p>It is guaranteed that the insertion operations will be valid.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,2,3,4], index = [0,1,2,2,1]
<strong>Output:</strong> [0,4,1,3,2]
<strong>Explanation:</strong>
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,0], index = [0,1,2,3,0]
<strong>Output:</strong> [0,1,2,3,4]
<strong>Explanation:</strong>
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1], index = [0]
<strong>Output:</strong> [1]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length, index.length &lt;= 100</code></li>
	<li><code>nums.length == index.length</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 100</code></li>
	<li><code>0 &lt;= index[i] &lt;= i</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Create Target Array in the Given Order
// Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        int length = 0;
        for(int i = 0; i<nums.length;i++){
            if(length!=0){
                int j = length;
                while(j>index[i]){
                    res[j] = res[j-1];
                    j--;
                }
            }
            res[index[i]] = nums[i];
            length++;
        }
        return res;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
