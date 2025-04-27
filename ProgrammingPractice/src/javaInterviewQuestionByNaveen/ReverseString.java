package javaInterviewQuestionByNaveen;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Hello";
		String revStr = new StringBuilder(str).reverse().toString();
		System.out.println(revStr);
	}

}
