/*
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

 

Example 1:

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

 */
package leetcode;

/**
 *
 * @author milton
 */
public class NonDecreasingArray {
  public boolean checkPossibility(int[] nums) {
        boolean flag = false;
        for(int  i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(flag) return false;
            
            if(i!=0 && nums[i-1]>nums[i+1]){
                nums[i+1] = nums[i];
            }
            flag= true;
            }
        }
        return true;
    }    
}
