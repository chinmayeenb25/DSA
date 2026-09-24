class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int square_length=0;
        int max=0;
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            square_length=Math.min(rectangles[i][0],rectangles[i][1]);
              if(square_length>max){
            max=square_length;
            count=1;
        }
        else if(square_length==max){
            count++;
        }

        }
      
        return count;
        
    }
}