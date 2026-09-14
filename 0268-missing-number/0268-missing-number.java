class Solution {
    public int missingNumber(int[] nums) {
        int output=nums.length;
        
    
        for(int i=0;i<nums.length;i++){
            output^=i^nums[i];
        
            }

            
                
            
                return output;
        
    }
}