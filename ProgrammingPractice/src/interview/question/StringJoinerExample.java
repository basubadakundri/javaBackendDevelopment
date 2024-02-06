package interview.question;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// Using StringJoiner with delimiter
		StringJoiner sj1 = new StringJoiner(",", "[", "]");
		sj1.add("A");
		sj1.add("B");
		sj1.add("C");

		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P");
		sj2.add("Q");
		System.out.println(sj2);

		sj1.merge(sj2);
		System.out.println(sj1);
	}


}
