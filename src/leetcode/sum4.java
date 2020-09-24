/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author milton
 */
public class sum4 {
    public static void main(String[]args){
        //1,-2,-3,4 ->4 0,1,-2,-3,-4 ->3  -1,-2,-3,0,1->2    -1,2->1    1,2,3,5,-6,4,0,10->4
        int nums[] = {1,-2,-3,4};
        int maxlen =0;
        for(int i=0;i<nums.length-1;i++){
            int len=1;
            int product = nums[i];
            int k=1;
            for(int j=i+1;j<nums.length;j++){
                product = product*nums[j];
                k++;
                if(product>0)
                len = Math.max(len,k);
                
               
             // System.err.println("product:"+product+"len: "+k);
            }
            maxlen = Math.max(maxlen, len);
        }
        System.out.println(maxlen);
    }
    
}
