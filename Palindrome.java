public class Palindrome {

    // Given an integer x, return true if x is a palindrome, and false otherwise.


    /**
     * 
     *  
     *  -A palindrome is a string that can be read the same way forward and backwards 
     *      - meaning 'x' is the same as reverse of 'x'
     * 
     *  - Approach does not require us to conver integer to a string :
     * 
     *  - To reverse 'x'
     *      - create a variable 'reverse'  to store the reversed 'x'
     *      - get digits of 'x' from right -> left
     *          - use modulos '%' to get rightmost digit
     *              - therefore rightmost digit = x % 10
     *          - multipy 'reverse' by 10 then increment rightmost 'digit'
     *          - Remove the rightmost 'x' using division operator 
     *               - therefore x = x / 10 
     *          - After all digits , compare 'x' with 'reverse'
     * 
     * 
     * 
     * 
     *  Pseudo Answer:
     *      - validate input parameter
     *          - if 'x' is negative ? , then x is not a palindrome
     *              - return false
     * 
     *      - create two variables
     *           - copy , equals to 'x'
     *           - reverse , reverse form of 'x'
     * 
     *      - while 'copy' is greater than 0
     *          - Retrieve the rightmost digit
     *               - digit = copy % 10
     *           - Multiply 'reverse' by 10 and then increment by 'digit
     *               - Remove rightmost digit
     *           - Return true if 'reverse' is equal to 'x'
     *               - Else, return false
     * 
     *  What is the Time and Space Complexity?
     *       - Time Complexity = O(logx), where x is the input value
     *          - O(logx), process each of the digits of 'x'
     *       - Space Complexity = O(1)
     * 
     * 
     */

     public boolean isPalindrome(int x) {
         if (x < 0)
             return false;

         int copy = x;
         int reverse = 0;

         while (copy > 0) {
             int digit = copy % 10;
             reverse = reverse * 10 + digit;
             copy /= 10;
         }
         
         return reverse == x;
     }
  
}