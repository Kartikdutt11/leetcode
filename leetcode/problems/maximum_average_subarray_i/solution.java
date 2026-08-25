class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(right = 0; right<k; right++){
            sum += nums[right];
        }
        maxsum = sum;
        while(right < nums.length){
            sum += nums[right] - nums[left];
            maxsum = Math.max(maxsum,sum);
            left++;
            right++;
        }
        return (double)maxsum / k;
    }
}