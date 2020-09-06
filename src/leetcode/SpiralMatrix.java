/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author milton
 */
public class SpiralMatrix {
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<Integer>();
        int length = matrix.length;
        if(length<1)
            return list;
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        
        while(true){
        
            if(left>right)
            break;
            //add top row elements from left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            
            if(top>bottom)
                break;
            //add rightmost column elements from top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(left>right)
                break;
            //add bottom row elements from right to left
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(top>bottom)
                break;
            //add leftmost column elements from bottom to top
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            
        }
        return list;
        
    }
}
