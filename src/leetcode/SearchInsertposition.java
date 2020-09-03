/*
 Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2

 */
package leetcode;

/**
 *
 * @author milton
 */
public class SearchInsertposition {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(target>nums[mid])
                start = mid+1;
            else if(target<nums[mid])
                end = mid-1;
            else
                return mid;
        }
        return start;
    }
}
