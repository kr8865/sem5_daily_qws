// Last updated: 7/31/2025, 2:06:14 PM
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        // Use two pointers
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            // Move right pointer until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        // Convert the character array back to a string and return it
        return new String(chars);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert character to lowercase
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
