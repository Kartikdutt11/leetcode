class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int mid = (numbers.length -1)/2;
        int left = 0;
        int right = numbers.length-1;
        // if (mid > target){
        //     right = mid;
        //     left = 0;
        // }
        // else{
        //     right = numbers.length-1;
        //     left = mid;
        // }
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1}; 
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}