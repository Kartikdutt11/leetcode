class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int vowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowels++;
            }
        }
        int maxVowels = vowels;
        for (int j = k; j < s.length(); j++) {
            if (isVowel(s.charAt(j))) {
                vowels++;
            }
            if (isVowel(s.charAt(j - k))) {
                vowels--;
            }
            maxVowels = Math.max(maxVowels, vowels);
        }
        return maxVowels;
    }
}