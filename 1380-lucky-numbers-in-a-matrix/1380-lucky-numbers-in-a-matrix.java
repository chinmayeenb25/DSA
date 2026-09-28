class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lis = new ArrayList<>();
       
        for(int i=0;i<matrix.length;i++){
             int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         int minColumn=0;
            int k=0;
            int j=0;
          // for(int j=0;j<matrxi[i].length;i++){
                while(k<matrix[i].length){
                    if(matrix[i][k]<min){
                        min=matrix[i][k];
                        minColumn=k;
                    }
                    k++;
                }
                while(j<matrix.length){
                    if(matrix[j][minColumn]>max){
                        max=matrix[j][minColumn];
                       
                    }
                     j++;
                }
                if(min==max){
                    lis.add(min);
                }

            
        }
       return lis;
    }
}