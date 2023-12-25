package geeksforgeeks;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseWord("Hello"));

	}

	public static String reverseWord(String str)
    {
        String rev ="";
		for (int i = str.length() - 1; i >= 0; i--) {
            rev= rev+str.charAt(i);
        }
        return rev;
    }
}
