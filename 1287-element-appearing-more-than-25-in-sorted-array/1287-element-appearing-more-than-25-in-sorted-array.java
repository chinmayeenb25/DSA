class Solution {
    public int findSpecialInteger(int[] arr) {
        int criteria=arr.length/4;
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr.length==1){
                return arr[0]; 
            }
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count>criteria){
                return arr[i];
            }
        }
        
        return arr[0];
    }
}