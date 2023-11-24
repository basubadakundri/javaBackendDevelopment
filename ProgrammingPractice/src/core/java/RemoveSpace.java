package core.java;

public class RemoveSpace {

	public static void main(String[] args) {
		System.out.println(modify("hello world"));
	}

	static String modify(String S) {
		S = S.replace(" ", "");

		return S; // your code here
	}
}
