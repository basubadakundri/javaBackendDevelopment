package string;

import java.util.Arrays;

public class CheckPattern2 {

	public static void main(String[] args) {
		System.out.println(ispar("{[]}"));
	}

	static boolean ispar(String x) {
		boolean status = true;
		if (x.length() % 2 == 0) {
			char[] ch = x.toCharArray();
			Arrays.sort(ch);
			for (int i = 0; i < ch.length - 1; i += 2) {

				if (ch[i] == '{') {
					if (ch[i + 1] != '}') {
						return false;
					}

				}
				if (ch[i] == '[') {
					if (ch[i + 1] != ']') {
						return false;
					}

				}
				if (ch[i] == '(') {
					if (ch[i + 1] != ')') {
						return false;
					}

				}
			}
		} else {
			return false;
		}
		return status;
	}
}
