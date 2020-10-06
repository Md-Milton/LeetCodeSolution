/*
 Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

    The length of both num1 and num2 is < 5100.
    Both num1 and num2 contains only digits 0-9.
    Both num1 and num2 does not contain any leading zero.
    You must not use any built-in BigInteger library or convert the inputs to integer directly.

 */
package string;

/**
 *
 * @author milton
 */
public class AddString {
     public String addStrings(String num1, String num2) {
        
       int len1=num1.length()-1;
        int len2=num2.length()-1;
        
        StringBuilder sb=new StringBuilder();
        int sum=0,carry=0;
        while(len1>=0 || len2>=0) {
            int first=len1>=0?num1.charAt(len1)-'0':0;
            int second=len2>=0?num2.charAt(len2)-'0':0;
            sum=carry+first+second;
            if(sum<=9){
                sb.insert(0,sum);
                sum=0;
                carry=0;
            } else {
                sb.insert(0,sum%10);
                sum=0;
                carry=1;
            }
            len1--;
            len2--;
        }
    if(carry==1)sb.insert(0,"1");
    return sb.toString();
    }

}
