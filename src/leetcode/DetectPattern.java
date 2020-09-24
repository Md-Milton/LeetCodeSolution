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
       /* int ar[] = {1,2,4,4,4,4};
        int len = ar.length;
        int m = 1;
        int k = 3;
        boolean valid = true;
        for (int i = 0; i + m * k <= len; ++i) {
      for (int j = 1; j < k && valid; ++j)
        for (int p = 0; p < m && valid; ++p)
          if (ar[i + j * m + p] != ar[i + p])
            valid = false;
    }
      if (valid)
                System.err.println("true");
      else
        System.err.println("false");
*/
    }
}
