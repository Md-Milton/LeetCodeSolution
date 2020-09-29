/*
  Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:

Input: "aba"
Output: True

Example 2:

Input: "abca"
Output: True
Explanation: You could delete the character 'c'.

 */
package string;

import leetcode.*;

/**
 *
 * @author milton
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return valid(s,start,end-1)||valid(s,start+1,end);//either left,right-1 or left+1,right is valid 
                
                start++;
                end--;
        }
        return true;
    }
    
    public static boolean valid(String st,int s,int e){
        while(s<e){
            if(st.charAt(s)!=st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
