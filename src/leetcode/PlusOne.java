/*
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.


Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

 */
package leetcode;

/**
 *
 * @author milton
 */
public class PlusOne {
     public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits==null || len==0)
            return new int[0];
        int sum=0;
        int cary =1;
        for(int i=len-1;i>=0;i--){
            sum=cary+digits[i];
            if(sum>=10)
                cary =1;
            else
                cary =0;
            digits[i] = sum%10;
            
        }

        if(cary==1){
            int ar [] = new int[len+1];
            System.arraycopy(digits,0,ar,1,len);
            ar[0]=1;
            return ar;
        }else
            return digits;
            
    }
    
}
