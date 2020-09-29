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
public class DetectPattern {
    public static void main(String []args)
    {
        int nums[]={0,0,1,1,1,1,2,3,3};
          int n = nums.length;
        
        int count=1;
        int j=0,i;
        for(i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                count++;
            
            else if(nums[i]!=nums[i+1] && count>=2){
                nums[j++] = nums[i-1];
                nums[j=j+1]=nums[i];
                count=1;
            }else{
                nums[j++]=nums[i];
            }
        }
        if(count>=2){
                nums[j++] = nums[i-1];
                nums[j=j+1]=nums[i];
                
        }else
        nums[j++]= nums[n-1];
        
        for(int k=0;k<j;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
