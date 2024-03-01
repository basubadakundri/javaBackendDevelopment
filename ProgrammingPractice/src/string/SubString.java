package string;

public class SubString {
	public static void main(String[] args) {
		String str = "beautiful";
		String newStr = str.substring(1);
		System.out.println("SubString: " + newStr);
		System.out.println(str.substring(2, 5));
		System.out.println("Is this string containe \"ful\": " + str.contains("ful"));
		System.out.println(str.indexOf("ui"));
	}
}
