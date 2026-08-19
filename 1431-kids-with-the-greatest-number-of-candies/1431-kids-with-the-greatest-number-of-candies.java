class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        boolean result=false;
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result=true;
            }
            else{
                result=false;
            }
            booleanList.add(result);
        }
        return booleanList;
    }
}