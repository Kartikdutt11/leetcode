class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum = 0;
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxsum = sum;
        for(int j = k; j< nums.length; j++){
            sum = sum + nums[j] - nums[j-k];
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        return (double) maxsum/k;
    }
}