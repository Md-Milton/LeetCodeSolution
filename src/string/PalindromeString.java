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
public class PalindromeString {
    public static void main(String args[]){
     String input = "babad";

    
        
     
     String longest = input.substring(0,1);
     
     for(int i=0;i<input.length()-1;i++){
        String temp = check(input,i,i);
        if(temp.length()>longest.length())
            longest = temp;
         temp = check(input,i,i+1); 
        if(temp.length()>longest.length())
            longest = temp; 
        
     }
        System.err.println(longest+" "+longest.length());
}
    public static String check(String s,int begin,int end){
       while(begin>=0&&end<=s.length()-1 && s.charAt(begin)==s.charAt(end)){
           begin--;
           end++;
       }
       return s.substring(begin+1, end);
        
    }
     
       
}

