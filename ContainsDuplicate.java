import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
      /**

        logic: 
        1. declare a new hashset
        2. loop through given array, once
        3. if set contains array element , return true 
        4. else add array element to the set 
        5. if none found return false

         complexity:
         Time: O(n)
         Space: O(n)

        
         */
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int number : nums){
             if(set.contains(number)){
                 return true;
             }
             set.add(number);
        }
        return false;
        
    }
}
