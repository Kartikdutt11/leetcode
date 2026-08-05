class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        double sum = 0;
        int left = 0;
        int right = k;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxsum = sum;
        while(right<nums.length){
            sum = sum + nums[right]- nums[left];
            left++;
            right++;
            if(maxsum < sum){
                maxsum = sum;
            }
        }
        return maxsum/k;
    }
}