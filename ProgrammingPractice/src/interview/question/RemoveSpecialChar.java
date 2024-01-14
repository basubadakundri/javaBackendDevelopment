package interview.question;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		String text = "Hello! my dear @";

		String st = text.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(st);
	}
}
