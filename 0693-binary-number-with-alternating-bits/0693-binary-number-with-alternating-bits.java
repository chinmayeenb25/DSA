class Solution {
    public boolean hasAlternatingBits(int n) {
          int flag=0;
        while(n!=0){
        int digit=n&1;
        n=n>>1;
        int digit1=n&1;
        if(digit1==digit){
                flag=1;

            }
        }
        if(flag==1){
            return false;
        }
        return true;

        
    }
}