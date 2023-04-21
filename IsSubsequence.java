public class IsSubsequence {
    /*
     * Logic:
     * 
     * 1. if s is empty return true
     * 2. char index initializer int i =0;
     * 3. loop through t.charArray()
     * 4. if c == s[i]  update i
     * 5. i ==  s.length() return true 
     * 6. else return false
     */
    
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
          return true;
    
        int i = 0;
        for ( char c : t.toCharArray())
          if (s.charAt(i) == c && ++i == s.length())
            return true;
    
        return false;
      }
}
