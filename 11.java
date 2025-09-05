class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r= height.length -1;
        int maxArea=0;

        while(l<r){

            int lh=height[l];
            int rh= height[r];
            int minHeight= Math.min(lh,rh);
            maxArea= Math.max(maxArea, minHeight*(r-l));
            if(lh<rh){
                l++;
            }
            else{
                r--;
            }
        
        }
        return maxArea; 
    }
}