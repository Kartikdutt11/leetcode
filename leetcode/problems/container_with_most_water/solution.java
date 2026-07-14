class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int l=0,r=0;
        int maxarea = 0;
        while (right > left){
            int area = Math.min(height[right], height[left]) * (right - left);
            if (area > maxarea) {
               maxarea = area;
                l = left;
                r = right;
            }if(height[right] > height[left]){      
                left ++;
            }
            else {
                right --; 
            }
        }  
        return maxarea;  
    }
}