public class BestTimeToBuySellStock {
    
    public int maxProfit(int[] prices) {
        
        //initialize the maxProfit and firstMininum variable
         int maxProfit = 0;
         int firstMin = prices[0];
 
         for(int i=0;i<prices.length;i++){
             //update the minimum price of buying
             firstMin = Math.min(firstMin, prices[i]);
             //find the profit
             int profit = prices[i]-firstMin;
 
             //update the profit with max profit
             maxProfit = Math.max(maxProfit, profit);
         }
         return maxProfit;
         
     }
}
