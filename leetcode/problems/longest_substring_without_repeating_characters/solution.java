class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0; 
        int right = 0;
        int count = 0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(s.charAt(right));
            right++;
            count++;
            maxlength = Math.max(maxlength, count);

        }
        return maxlength;
    }
}