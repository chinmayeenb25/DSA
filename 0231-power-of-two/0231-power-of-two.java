class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0){
       boolean ans=(n&(n-1))==0;
       return ans; 
        }
        else{
            return false;
        }
    }
}