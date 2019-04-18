class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length > 0){
            int car = prices[0];
            int sum = 0;
            for (int i = 0;i<prices.length;i++){
                if (car > prices[i]){
                    car = prices[i];
                }
                if (car < prices[i]){
                    if (car-prices[i] < sum){
                        sum = car-prices[i];
                    }
                }
            }
            return Math.abs(sum);
        }
        return 0;
        

        
    }
}
