class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int w=r-l;
            int ch=Math.min(height[r],height[l]);
            int area=ch*w;
             maxarea=Math.max(area,maxarea);
            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}