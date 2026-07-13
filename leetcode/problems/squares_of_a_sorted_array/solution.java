class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        while(k>=0){
            if(Math.abs(nums[right]) > Math.abs(nums[left]) ){
                arr[k] = nums[right]*nums[right];
                right--;
                k--;
            }
            else{
                arr[k] = nums[left]*nums[left];
                k--;      
                left++;       
            }
        }
        return arr;       
    }
}