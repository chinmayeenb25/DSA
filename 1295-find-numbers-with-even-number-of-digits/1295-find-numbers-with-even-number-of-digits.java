class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int digit_count=0;
            
            while(num!=0){
                int digit=num%10;
                num=num/10;
                digit_count++;
            }
            if(digit_count%2==0){
                count++;
            }
        }
        return count;
        
    }
}