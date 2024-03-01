package string;

public class CheckPattern {

	public static void main(String[] args) {

		System.out.println(ispar("{[()]}"));
	}

	// this method will check string is balanced with the opposite bracket
//    not work in this case "{}[]()" for this solution refer CheckPattern2
	static boolean ispar(String x) {
		char[] ch = x.toCharArray();
		if (ch.length % 2 == 0) {
			boolean status = true;
			for (int i = 0; i < ch.length / 2; i++) {
				int temp = ch.length - (i + 1);
				if (ch[i] == '{') {
					if (ch[temp] != '}') {
						return false;
					}

				}
				if (ch[i] == '[') {
					if (ch[temp] != ']') {
						return false;
					}

				}
				if (ch[i] == '(') {
					if (ch[temp] != ')') {
						return false;
					}

				}
			}
			return status;
		} else {
			return false;
		}

	}
}
