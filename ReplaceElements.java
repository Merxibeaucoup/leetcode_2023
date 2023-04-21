/**
 * ReplaceElements
 */
public class ReplaceElements {

    /*
     * Base case : last element should be = -1
     * 
     * Logic:
     * 
     * 1. set initial max to -1
     * 2. iterate backwards 
     * 3. compare max with element on its left arr[i]
     * 4. insert max into arr[i]
     * 5. update max 
     * 6. after all inserts , return arr 
     * 
     */

    public int[] replaceElements(int[] arr) {   

    int max = -1; // base case 
    
    for (int i = arr.length - 1; i >= 0; i--)
    {
        int temp = arr[i]; // current element

        arr[i] = max; 
        max = Math.max(max, temp);
    }
    return arr;

    }
}