class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max_on_right=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max_on_right){
                    max_on_right=arr[j];
                }
            }
            arr[i]=max_on_right;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}