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