package string;

public class NumberOfCharInEachWord {

	public static void main(String[] args) {
		String str = "Hello world";
		countNumberofletter(str);

	}

	public static void countNumberofletter(String str) {
		for (String word : str.split(" ")) {
			System.out.printf(word + " contains %d charectors %n", word.length());

		}
	}

}
