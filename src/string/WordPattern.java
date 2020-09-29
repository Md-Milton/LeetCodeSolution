/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

 */
package string;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author milton
 */
public class WordPattern {
     public boolean wordPattern(String pattern, String s) {
        Map<Character,String>map = new HashMap<Character,String>();
        String word[]=s.split("\\s+");
       
        if(pattern.length()!=word.length)
            return false;
     
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
           
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word[i])){
                return false;
                 }
            }else {
                if(map.containsValue(word[i])) {
                    return false;
                }
                map.put(ch,word[i]);
            }

            
        }
 
        return true;
    }
}

