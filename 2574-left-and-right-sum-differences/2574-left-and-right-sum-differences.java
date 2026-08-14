class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int[] diff=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int rsum=0;
            for(int j=i+1;j<nums.length;j++){
                rsum+=nums[j];
                rightSum[i]=rsum;
            }
        }
        for(int i=nums.length-1;i>0;i--){
            int lsum=0;
            for(int j=i-1;j>=0;j--){
                lsum+=nums[j];
                leftSum[i]=lsum;
            }
        }
        for(int i=0;i<nums.length;i++){
            diff[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return diff;

        
    }
}