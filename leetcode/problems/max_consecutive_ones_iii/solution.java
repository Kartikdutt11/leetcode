class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = 0;
        int maxcount = 0;
        int zerocount = 0;
        while(right < nums.length){
            if(nums[right] == 1){
                right++;
                count++;
                maxcount =Math.max(maxcount,count);
            }
            else if(nums[right] == 0 && zerocount < k){
                right++;
                zerocount++;
                count++;
                maxcount =Math.max(maxcount,count);
            }
            else if(nums[right] == 0 && zerocount >= k){
                if(nums[left] == 0){
                    zerocount--;
                    count--;
                }
                else if(nums[left] == 1){
                    count--;
                }
                left++;
            }
        }
        return maxcount;
    }
}