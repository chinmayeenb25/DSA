class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
              product=(nums[i]-1)*(nums[j]-1);
              if(product>max){
                max=product;
              }
              }
            }
        }
        return max;
    }
}