class Solution {
    public int maxProfit(int[] prices) {
int l=0;
int r=1;
int diff=0;
int max=0;
while(r<prices.length){
    if(prices[l]<prices[r]){
        diff=prices[r]-prices[l];
        if(diff>max){
            max=diff;
        }
    }else{
        l=r;
    }
    r++;
}
return max;
        
    }
}