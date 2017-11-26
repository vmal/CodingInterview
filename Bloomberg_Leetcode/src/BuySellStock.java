/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit.

Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2: Input: [7, 6, 4, 3, 1] Output: 0

In this case, no transaction is done, i.e. max profit = 0.


 */

public class BuySellStock
{
    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
//    private static int maxProfit(int[] arr)
//    {
//        int smallest = arr[0],smallindex = 0;
//        for(int i=1;i<arr.length;i++)
//        {
//            if(arr[i]<smallest)
//            {
//                smallest = arr[i];
//                smallindex = i;
//            }
//        }
//        int largest = arr[smallindex];
//       for(int i = smallindex;i<arr.length;i++)
//       {
//           if(arr[i]>largest)
//               largest = arr[i];
//       }
//        return largest-smallest;
//    }
        
    public static void main(String args[])
    {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfit(arr));
    }
}
