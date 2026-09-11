class Solution {
    public int findComplement(int num) {
        
        int result=0;
        int position=0;
        while(num!=0){
            int digit=(num&1);
        if(digit==1){
            digit=0;
        }
        else{
            digit=1;
        }
         result+=digit << position;
       
        num=num>>1;
        position++;
        }
        return result;
        
    }
}