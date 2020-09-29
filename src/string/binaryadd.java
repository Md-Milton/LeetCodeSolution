/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import leetcode.*;

/**
 *
 * @author milton
 */
public class binaryadd {
       public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carray = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0){
           int sum = carray;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            System.err.println("sum :s"+sum);
            sb.append(sum % 2);
            carray = sum / 2;
        }
        if(carray!=0)
            sb.append(carray);
        
        return sb.reverse().toString();
    }
}
