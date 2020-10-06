/*
Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Input: "hello"
Output: "holle"

 */
package string;
import java.util.ArrayList;

/**
 *
 * @author milton
 */
public class ReverseVowel {
      public String reverseVowels(String s) {
        ArrayList<Character>vowel=new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        
        int start = 0;
        int end= s.length()-1;
        char[]ar = s.toCharArray();
        
        while(start<end){
            if(!vowel.contains(ar[start])){
                start++;
                continue;
            }
                
            if(!vowel.contains(ar[end])){
                end--;
                continue;
            }
            
            char t = ar[start];
            ar[start]=ar[end];
            ar[end]=t;
            start++;
            end--;
        }
        return new String(ar);
    }
}
