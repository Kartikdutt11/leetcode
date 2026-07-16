class Solution {
    public int trap(int[] height) {
        int st = 0;
        int en = height.length -1;
        int lt = 0;
        int rt = 0;
        int water = 0;
        while(st < en){
            if(height[st] < height[en]){
                if(height[st] >= lt){
                    lt = height[st];
                }else{
                    water += lt - height[st];        
                }
                st++;
            }
            else{
                if(height[en] >= rt){
                    rt = height[en];
                }else{
                    water += rt - height[en];        
                }
                en--;
            }
        }
        return water;
    }
}