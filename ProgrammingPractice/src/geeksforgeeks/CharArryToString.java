package geeksforgeeks;

// Convert List of Character into String
public class CharArryToString {
	public static void main(String[] args) {
	   char[] arr = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
		System.out.println(chartostr(arr, arr.length));
	}

	static String chartostr(char arr[], int N) {
		String str = "";
		for (char c : arr) {
			str = str + c;
		}
		return str;
	}
}
