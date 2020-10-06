/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

 */
package string;

import java.util.Arrays;

/**
 *
 * @author milton
 */
public class ReverseWord {
      public String reverseWords(String s) {
        if(s.length()==0 || s==null)
            return "";
        String str[]=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].equals("")){
                sb.append(str[i]).append(" ");
            }
            
        }
        
        return sb.length()==0?"":sb.substring(0,sb.length()-1);
        
    }
}
