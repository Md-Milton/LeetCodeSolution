/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author milton
 */
public class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return 1;
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                int index = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                
            }
            else{
                i++;
            }
            
            for(i=0;i<nums.length;i++){
                if(nums[i]!=i+1)
                    return i+1;
            } 
        }
         return nums.length+1;
    }

}
