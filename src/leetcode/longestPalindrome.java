/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
package leetcode;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author milton
 */
public class longestPalindrome {
    public int longestPalindrome(String s) {
    Map<Character,Integer>map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else
                map.put(c,1);
        }
        
        int length =0;
        boolean flag = false;
        for(int count:map.values()){
            if(count%2 == 0){ // for even no. chars 
                length+=count;  
            }else{  // for odd no chars
                flag=true;
                length+=count-1;
            }
        }
        if(flag)return length+=1; //   odd length palindrome
        return length; // even length palindrome;
       
    }
}
