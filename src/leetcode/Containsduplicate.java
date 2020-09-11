/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.Arrays;
/**
 *
 * @author milton
 */
public class Containsduplicate {
        public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag=true;
            }       
        }
        
        if(flag){
            return true;
        }else
            return false;        
        
    }
}
