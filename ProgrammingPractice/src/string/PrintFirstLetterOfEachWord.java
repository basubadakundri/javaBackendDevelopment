package string;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		String str = "Learn with Krishnasandeep";
		printFirstLetter(str);
	}

	private static void printFirstLetter(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : arr) {
			sb.append(word.charAt(0));
		}
		System.out.println(sb);
	}

}
