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
public class MissingNumber {
    public static void main(String[]args){
        int ar[] = {3,0,1};
        int n = ar.length-1;
        Arrays.sort(ar);
        int sum=(n+1)*(n+2)/2;
        int total =0;
        System.err.println(Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            sum-=ar[i];
        }
        System.err.println(sum);
        System.err.println(total);
    }
}
