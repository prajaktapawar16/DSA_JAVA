class Solution {
    public int maxProfit(int[] prices) {
        int maximum=0;
        int minprice=Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            int price = prices[i];

            if(price<minprice){
                minprice=price;
            }else{
                maximum=Math.max(maximum, price-minprice);
            }
        }
        return maximum;
        
    }
}