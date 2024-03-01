package string;

public class StringPanagram {

	public static void main(String[] args) {
		String str = "the quick brown fox jumps over lazy dog";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1) {
				System.out.println("this string is not panagram");
				return;
			}
		}
		System.out.println("Given string is Panagram");
	}

}
