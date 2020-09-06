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
public class SpiralMatrixII {
     public int[][] generateMatrix(int n) {
        int mat[][]=new int [n][n];
       
        int top =0;
        int left =0;
        int right = n-1;
        int bottom = n-1;
        int value=1;
        while(value<=n*n){
            
            for(int i=left;i<=right;i++){
                mat[top][i]=value;
                value++;
            }top++;
            
            for(int i=top;i<=bottom;i++){
                mat[i][right]=value;
                value++;
            }right--;
            
            for(int i=right;i>=left;i--){
                mat[bottom][i]=value;
                value++;
            }bottom--;
            
            for(int i=bottom;i>=top;i--){
                mat[i][left]=value;
                value++;
            }left++;
        }
        return mat;
    }
}
