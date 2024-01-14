package string;

public class RemoveDubliFromString {

	public static void main(String[] args) {
		String st = "sandeep";
		System.out.println(removedupli(st));
	}

	private static String removedupli(String st) {
		String newSt = "";
		for (int i = 0; i < st.length(); i++) {
			if (!newSt.contains(String.valueOf(st.charAt(i)))) {
				newSt = newSt + st.charAt(i);
			}
		}
		return newSt;
	}

}
