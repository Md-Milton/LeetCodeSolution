/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author milton
 */
public class ContainsKeyII {
   public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                if(i-value<=k)
                    return true;
            }
            map.put(nums[i],i);
        }
        
        return false;
    }    
}
