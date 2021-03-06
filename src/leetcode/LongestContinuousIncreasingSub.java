/*
  Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:

Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 

 */
package leetcode;

/**
 *
 * @author milton
 */
public class LongestContinuousIncreasingSub {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null || nums.length<1)
            return 0;
        if(nums.length==1)
            return 1;
        int i;
        int len =0;
        int maxlen=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                len++;
            else{
                maxlen = Math.max(maxlen,len);
                len=0;
            }
            maxlen = Math.max(maxlen,len);
        }
        return maxlen+1;
    }
}
