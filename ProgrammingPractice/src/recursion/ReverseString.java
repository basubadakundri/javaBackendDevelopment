package recursion;
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello"; // Change the string to be reversed
        String reversed = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
		if (str.isEmpty() || str == null) {
            return str;
        } else {
            // Recursive call to reverse the substring from the 2nd character to the end
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
