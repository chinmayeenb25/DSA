class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int answer=0;
        int number=0;
        int digit;
        int digit1;
        while(num>0){
            digit=num%10;
            number=number*10+digit;
            num=num/10;

        }
        while(number>0){
            digit1=number%10;
            answer=answer*10+digit1;
            number=number/10;
        }
        if(answer==original){
            return true;
        }else{
            return false;
        }

        
    }
}