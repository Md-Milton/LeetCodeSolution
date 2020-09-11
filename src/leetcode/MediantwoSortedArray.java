/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */
package leetcode;

/**
 *
 * @author milton
 */
public class MediantwoSortedArray {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int arr []= new int [len1+len2];
        int  a=0,b=0,c=0;
        while(a<len1 && b<len2){
            if(nums1[a]<nums2[b])
                arr[c++]=nums1[a++];
            else
                arr[c++]=nums2[b++];
        }
        while(a<len1){
         
                arr[c++]=nums1[a++];
        }
        
        while(b<len2){
         
                arr[c++]=nums2[b++];
        }
        
        int len = arr.length;
        int mid = len/2;
        double median=0;
        if(len%2 == 0){
            median = arr[mid]+arr[mid-1];
            median/=2;
        }else{
            median = arr[mid];
        }
        return median;
    }
}
