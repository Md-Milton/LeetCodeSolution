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
package leetcode;

/**
 *
 * @author milton
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int l=0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return valid(s,l,r-1)||valid(s,l+1,r);//either left,right-1 or left+1,right is valid 
                
                l++;
                r--;
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
