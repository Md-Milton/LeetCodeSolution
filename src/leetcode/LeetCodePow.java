/*
 Implement pow(x, n), which calculates x raised to the power n (i.e. xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

 */
package leetcode;

/**
 *
 * @author milton
 */
public class LeetCodePow {
 public double pow(double x, int n) {
        if(n==0) return 1.0;
        double half=pow(x,n/2);
        if(n%2==0) return half*half;
        else if(n>0) return half*half*x;
        else return half*half/x;
    }
    
}
