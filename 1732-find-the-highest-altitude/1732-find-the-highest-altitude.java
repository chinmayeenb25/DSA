class Solution {
    public int largestAltitude(int[] gain) {
        int [] altitudes=new int[gain.length+1];
        int net_gain=0;
        for(int i=0;i<gain.length;i++){
           net_gain+=gain[i];
           altitudes[i+1]=net_gain; 
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<altitudes.length;i++){
            if(altitudes[i]>max){
                max=altitudes[i];
            }
        }
        return max;
        
    }
}