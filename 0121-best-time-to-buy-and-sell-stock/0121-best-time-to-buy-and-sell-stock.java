class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprice=prices[0];
        int maxi=0;        
        for(int i=1;i<n;i++){
            if(prices[i]<minprice){
                minprice= prices[i];
            } else{
                maxi= Math.max(maxi, prices[i]-minprice);
            }
        }
        return maxi;
    }
}