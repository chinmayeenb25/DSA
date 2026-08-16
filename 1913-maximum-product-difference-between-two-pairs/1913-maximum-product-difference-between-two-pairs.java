class Solution {
    public int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]*nums[j]>max){
                    max=nums[i]*nums[j];
                }
                if(i!=j &&nums[i]*nums[j]<min){
                    min=nums[i]*nums[j];
                }
            }
        }
        return max-min;
        
    }
}