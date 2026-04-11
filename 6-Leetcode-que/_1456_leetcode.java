public class _1456_leetcode {
    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {
            // Add next character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove previous character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u';
    }
}
