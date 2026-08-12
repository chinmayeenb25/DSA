class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       // int count=0;
        int[] count_arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                 if(j!=i && nums[j]<nums[i]){
                    count++;
                    count_arr[i]=count;
                    
                 }
            }
        }
        return count_arr;
        
        
    }
}