package string;

public class CheckVowelInString {

	public static void main(String[] args) {
		String str = "yesturday is history";
//		String str = null;
		countVowel(str);
	}

	public static void countVowel(String str) {
		if(str == null) {
			throw new IllegalArgumentException();
		}
		str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				System.out.println(str.charAt(i));
		}
	}
	System.out.println("Total number of vowel in the Given String is: " + count);
}
}
