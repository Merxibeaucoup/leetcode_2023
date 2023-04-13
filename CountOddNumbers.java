public class CountOddNumbers {



    public int countOddsOptimal(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }


    /******************* Or brute force  */


     public int countOdds(int low, int high) {
       
       if(low%2 ==0){
           low++;
       }
       int oddCounter=0;

       for(int i = low; i<=high; i++){
           if(i%2 ==1){
               oddCounter++;
           }
       }
       return oddCounter;
    }
    
}
