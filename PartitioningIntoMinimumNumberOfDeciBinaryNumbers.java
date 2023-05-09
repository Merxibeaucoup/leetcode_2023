public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    
//leetcode 1689

/*
 * strategy:
 * 
 * touch each character in the string 
 * then get the ascii value 
 * compare the ascii value to the other chars 
 * and return the highest ascii char.
 */

    public int minPartitions(String n) {
        
        int ans =0;
        for(char i : n.toCharArray()){
            int currentValue = i - '0';
            ans = Math.max(ans, currentValue);
        }
            return ans;
    }
}
