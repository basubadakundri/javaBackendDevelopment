package core.java;

public class RemoveVowelFormString2 {

	public static void main(String[] args) {
		System.out.println(removeVowels("hello world"));

	}

	static String removeVowels(String S) {
		// code here

		String n = S.replaceAll("[aeiou]", "");

		return n;
	}

}
