public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private static boolean check(String s, int left, int right) {
        // Base case: pointers have met or crossed
        if (left >= right) {
            return true;
        }
        // Character mismatch
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // Recurse toward the center
        return check(s, left + 1, right - 1);
    }
}