import java.util.Arrays;

public class IsAnagram {
    
 /**

    Logic:

    1. check if both strings are of the same length, if not , return false
    2. convert both strings to char arrays
    3. sort both char arrays
    4. return if their equals or not 
     */
    public boolean Anagram(String s, String t) {
        
        if(s.length() != t.length())return false;

       char [] c = s.toCharArray();
        Arrays.sort(c);
       char [] c2 = t.toCharArray();
       Arrays.sort(c2);

    
       return Arrays.equals(c,c2);  
    }

}
