/*
 Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.

If there is no such integer in the array, return 0.

 

Example 1:

Input: nums = [21,4,7]
Output: 32
Explanation:
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.

 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author milton
 */
public class Four_Divisors {
       public int sumFourDivisors(int[] nums) {
        int sum =0;
       for(int i=0;i<nums.length;i++){
            int len = nums[i];
            sum+= count(len);
          
        }
        return sum;
    }
    
    
    public static int sumList(List<Integer>list){
        int sum =0;
        for(Integer l:list){
            sum+=l;
        }
        return sum;
    }
    
    public static int count(int n){
        List<Integer>sumList = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sumList.add(i);
            }
        }
        int sum =0;
        if(sumList.size()==4){
            sum = sumList(sumList);
            return sum;
        }else
            return 0;
        
    }
}
