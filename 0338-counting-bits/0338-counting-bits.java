class Solution {
    public int[] countBits(int n) {
       
        int [] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i;
             int digit_maker=0;
             int count=0;
            while(num!=0){
                int digit=(num&1);
                if(digit==1){
                    count++;
                }
                
                num=num>>1;

                

            }
            arr[i]=count;
            

        }
        return arr;
        
    }
}