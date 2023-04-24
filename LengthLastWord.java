public class LengthLastWord {
    

    public int lengthOfLastWord(String s) {

        String [] words = s.trim().split(" ");
        int length = words.length;

        int lastSize =0;
       
           String last = words[length-1];
           lastSize = last.length();
        

        return lastSize;
        
    }
}
