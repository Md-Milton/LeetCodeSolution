/*
 387. First Unique Character in a String
Easy

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

 */
package string;

/**
 *
 * @author milton
 */
public class FirstUniqueCharacter {
     public int firstUniqChar(String s) {
       if(s==null || s.length()==0)
           return -1;
       char []ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char a = s.charAt(i);
            if(s.indexOf(a)==s.lastIndexOf(a))
                return i;
        }
        return -1;
    }
}
