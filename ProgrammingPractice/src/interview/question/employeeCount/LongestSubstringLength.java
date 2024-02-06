package interview.question.employeeCount;
import java.util.HashSet;

public class LongestSubstringLength {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
