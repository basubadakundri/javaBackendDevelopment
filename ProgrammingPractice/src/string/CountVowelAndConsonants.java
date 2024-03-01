package string;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		String str = "SandeepA";
		count(str);
	}

	private static void count(String str) {
		str = str.toLowerCase();
		int countVowel = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				countVowel++;
				break;
			}
			default:
				consonants++;
			}
		}
		System.out.println("Number of Vowel in the given string is: " + countVowel);
		System.out.println("Number of consonants in the given string is: " + consonants);

	}

}
