class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff=Integer.MIN_VALUE;
        int diff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[j]&&i<j){
                    diff=nums[j]-nums[i];
                }
                if(diff>max_diff){
                    max_diff=diff;
                }

            }

        }
        return max_diff;

        
    }
}