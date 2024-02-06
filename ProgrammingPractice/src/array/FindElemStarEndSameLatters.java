package array;

public class FindElemStarEndSameLatters {

	public static void main(String[] args) {
		String[] st = { "hello", "aba", "cfd", "gfg" };
			searchElem(st);
	}

	public static void searchElem(String[] st) {
		for (int i = 0; i < st.length; i++) {
			if (check(st[i])) {
				System.out.println(st[i]);
			}

		}
	}

	public static boolean check(String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return true;
		} else
			return false;
	}
}
