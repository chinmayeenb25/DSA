class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] nums1=new int[nums.length/2];
        int [] nums2=new int[nums.length/2];
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                nums1[i]=nums[i];
            }
            else{
                nums2[j]=nums[i];
                j++;
            }
        }
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=nums1[k];
                k++;
            }
            else{
                nums[i]=nums2[l];
                l++;
                
            }
        }
        return nums;
        
    }
}