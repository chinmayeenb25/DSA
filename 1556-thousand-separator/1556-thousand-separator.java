class Solution {
    public String thousandSeparator(int n) {
        int digit_count=0;
        int digit=0;
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        int length=sb.length();
        while(n!=0){
            digit=n%10;
            n=n/10;
            digit_count++;
            if(digit_count%3==0&& n!=0 ){
               sb.insert(length-digit_count,'.'); 
            }
        }
        return sb.toString();
    }
}