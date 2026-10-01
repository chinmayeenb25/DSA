class Solution {
    public int totalMoney(int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            if(i<7){
              sum+=i+1;
            }
            else{
                sum+=i%7+i/7+1;
            }
        }
        return sum;
    }
}