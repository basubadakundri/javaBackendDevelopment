package string;

public class RemoveChar {

	public static void main(String[] args) {
		String str = "CloudTech";
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != 'C' && str.charAt(i) != 'c') {
//				sb.append(str.charAt(i));
//			}
//		}
//		System.out.println(sb);

		str = str.replace("C", "");
		System.out.println(str);
	}

}
