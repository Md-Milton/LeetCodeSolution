/*
 You are given a string representing an attendance record for a student. The record only contains the following three characters:

    'A' : Absent.
    'L' : Late.
    'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:

Input: "PPALLP"
Output: True

 */
package string;

import leetcode.*;

/**
 *
 * @author milton
 */
public class StudentAttendanceRecord {
      public boolean checkRecord(String s) {
     
        if(s.indexOf("LLL")!=-1)
            return false;
        
        int len = s.length();
        int acount =0;
       
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A')
                acount++;
            if(acount>1)
                return false;
            
        }

            return true;
        
    }
    
}
