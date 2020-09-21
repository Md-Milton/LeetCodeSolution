/*
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

 */
package leetcode;

/**
 *
 * @author milton
 */
public class Jump_Game {
     public boolean canJump(int[] nums) {
        int start = nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(start<i && nums[i]==0)
                return false;
            if(i+nums[i]>start)
                start = i+nums[i];
        }
        
        if(start>=nums.length-1)
            return true;
        
        return false;
    }
}
