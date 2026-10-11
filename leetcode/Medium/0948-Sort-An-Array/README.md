# Sort an Array

**Difficulty:** Medium  
**Topics:** Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort  
**LeetCode URL:** [Sort an Array](https://leetcode.com/problems/sort-an-array/)

## Problem Description

<p>Given an array of integers <code>nums</code>, sort the array in ascending order and return it.</p>

<p>You must solve the problem <strong>without using any built-in</strong> functions in <code>O(nlog(n))</code> time complexity and with the smallest space complexity possible.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,2,3,1]
<strong>Output:</strong> [1,2,3,5]
<strong>Explanation:</strong> After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,1,1,2,0,0]
<strong>Output:</strong> [0,0,1,1,2,5]
<strong>Explanation:</strong> Note that the values of nums are not necessarily unique.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-5 * 10<sup>4</sup> &lt;= nums[i] &lt;= 5 * 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Sort an Array
// Link: https://leetcode.com/problems/sort-an-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    void mergesort(int[] nums, int left, int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        mergesort(nums,left,mid);
        mergesort(nums,mid+1,right);
        merge(nums, left, mid, right);
    }
    void merge(int[] nums, int left, int mid, int right){
        int[] res = new int[right-left+1];
        int k = 0;
        int i = left;
        int j = mid+1;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                res[k++] = nums[i++];
            }
            else{
                res[k++] = nums[j++];
            }
        }
        while(i<=mid){
            res[k++] = nums[i++];
        }
        while(j<=right){
            res[k++] = nums[j++];
        }
        for(int p = 0; p<res.length; p++){
            nums[left+p] = res[p]; 
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
