class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int right_sum=0;
            int left_sum=0;
            for(int j=i+1;j<nums.length;j++){
                right_sum+=nums[j];
                }
            for(int k=0;k<i;k++ ){
                left_sum+=nums[k];
            }
            if(left_sum==right_sum){
                return i;
            }
        }
        return -1;
        
    }
}