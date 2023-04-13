/**
 * RemoveElement
 */
public class RemoveElement {

    
    /**  
if current element is not equal to val, save that element in the array

example given : nums = [3,2,2,3], val = 3


1.counter =0
2. checks :
i =0, 3==3
i=0, 2!=3 ....-> save it in array , increment counter
i=1, 2!=3.....-> save it in array, increment counter
i =0, 3==3

return counter 

    */
    public int removeElement(int[] nums, int val) {

        int counter = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[counter]= nums[i];
                counter++;
            }
        }
        return counter;
    }
}