/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

Input: 16
Output: true

Example 2:

Input: 5
Output: false


 */
package leetcode;

/**
 *
 * @author milton
 */
public class Power_Of_Four {
       public boolean isPowerOfFour(int num) {
        if(num==0)
            return false;
        int pow = (int)(Math.log(num)/Math.log(4));
        if(num == Math.pow(4,pow))
            return true;
        else
            return false;
    }
}
