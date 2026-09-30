class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int freq_sum=0;
        for(int i=0;i<nums.length;i+=2){
            int frequency=nums[i];
            freq_sum+=frequency;
            }  
            int arr[]=new int[freq_sum];

        int j=0;
        for(int i=0;i<nums.length;i+=2){
            int frequency=nums[i];
            freq_sum+=frequency;
          

            int value=nums[i+1];
            while(frequency!=0){
                arr[j]=value;
                frequency--;
                j++;
            }
            
        }
        return arr;
    }
}