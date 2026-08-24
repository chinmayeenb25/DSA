class Solution {
    public int[] finalPrices(int[] prices) {
        int min_index=0;
        
        for(int i=0;i<prices.length;i++){
            int discount=0;
            for(int j=i+1;j<prices.length;j++){
                if(j>i && prices[j]<=prices[i] ){
                    discount=prices[j];
                    break;

                }
               
            }
             prices[i]=prices[i]-discount;
        }
      return prices;  
    }
}