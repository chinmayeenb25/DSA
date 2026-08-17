class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        int [] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums1[j]=nums[i];
                j++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2!=0){
                nums1[j]=nums[k];
                j++;
            }
        }
        
        return nums1;  
    }
}