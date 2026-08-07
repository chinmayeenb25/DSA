class Solution {
    public int[] getConcatenation(int[] nums) {
        int j=0;
        int[] new_nums=new int [nums.length*2];
        for(int i=0;i<nums.length;i++){
            if(i<nums.length){
                new_nums[i]=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            new_nums[nums.length+i]=nums[j];
            j++;
            }

        
        return new_nums;
        
    }
}