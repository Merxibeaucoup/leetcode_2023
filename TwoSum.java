import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Given an array of integers nums and an integer target, 
    // return indices of the two numbers such that they add up to target.


    /*
     * Pseudo Answer:
     *  - create a hashmap map to keep track of element and index 
     *  - iterate through the indices of the input array nums
     *         - if map contains target-nums[i]
     *              - return {i, map.get(target- nums[i])}
     *         - Put 'nums[i]' and i into map
     *              - return empty array
     *
     * 
     *      - Time complexity : 0(n)  -> n is length of input array
     *          - 0(n) because,  each index is visited once 
     *      - Space complexity : 0(n) -> n is length of input array
     *          - 0(n) because,  map
     */


    public  int[] twoSum(int [] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target -nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }            
                map.put(nums[i], i);
        }
        return null;

    }
    
}
