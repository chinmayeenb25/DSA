class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
           int element=arr[i];
            for(int j=0;j<arr.length;j++){
                if(element==arr[j]*2 && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}