public class maxProfit {
	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 4, 0 ,7, 8, 4};
		System.out.print(maxProf(arr));
	}
	
	//Find the maximum profit based on days
	/*
	 * Say you have an array for which the ith element is the price of a given stock on day i.

	 * If you were only permitted to complete at most one transaction 
	 * (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

	 *	Note that you cannot sell a stock before you buy one.
	 */
	 public static int maxProf(int[] prices) {
	        int profit = 0, maxProf = 0, min = 0;
	        if(prices.length > 0){
	            min = prices[0];
	        }
	        for(int i = 1; i < prices.length; i++){
	            profit = prices[i] - min;
	            if(min>prices[i]){
	                min = prices[i];
	            }
	            if(profit > maxProf){
	                maxProf = profit;
	            }
	        }
	        return maxProf;
	    }
}
