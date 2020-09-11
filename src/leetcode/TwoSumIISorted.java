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
public class TwoSumIISorted {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int [2];
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
            if((numbers[i]+numbers[j])==target && i<j)
            {
                a[0]=i+1;
                a[1]=j+1;
                }
            }
        }
        return a;
    }
}
