class Solution {
    public int numberOfMatches(int n) {
        int match_count=0;
        while(n!=1){
            if(n%2==0){
               int matches1=n/2;
               n=n-matches1; 
               match_count+=matches1;
            }
            else if(n%2!=0){
                int matches2=(n-1)/2;
                n=n-matches2;
                match_count+=matches2;
            }
        }
      return match_count;  
    }
}