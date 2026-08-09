class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total = 0;  
        for(int i=0;i<prices.length;i++){
            total += prices[i];
        }

        int i = prices.length - 1;
        int j = discounts.length - 1;
        
        while( i>=0 && j>=0 ){
            total -= (double)prices[i] * discounts[j]/100;
            i--;j--;
        }
        
        return total;
    }
}
