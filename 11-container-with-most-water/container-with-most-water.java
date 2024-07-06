class Solution {
    public int maxArea(int[] height) {

        /* Brute-Force with O(n^2)
        int maxArea = 0;
        for(int l=0; l < height.length - 1; l++) {
            for(int r=l+1; r < height.length; r++) {
                int area = (r - l) * Math.min(height[l], height[r]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
        */

        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;

        while(l < r) {
            int area = (r - l) * Math.min(height[l], height[r]); 
            maxArea = Math.max(maxArea, area);

            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}