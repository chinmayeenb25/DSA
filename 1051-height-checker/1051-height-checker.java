class Solution {
    public int heightChecker(int[] heights) {
        int[] original=new int[heights.length];
        for(int i=0;i<heights.length;i++){
             original[i]=heights[i];
        }
        int count=0;
        for(int i=0;i<heights.length;i++){
            for(int j=1;j<heights.length;j++){
                if(heights[j]<heights[j-1]){
                    int temp=heights[j];
                    heights[j]=heights[j-1];
                    heights[j-1]=temp;
                }
            }
        }
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=original[i]){
               count++;
            }
        }
        return count;
        
    }
}