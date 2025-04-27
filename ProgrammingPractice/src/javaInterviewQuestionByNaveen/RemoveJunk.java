package javaInterviewQuestionByNaveen;

public class RemoveJunk {
	public static void main(String[] args) {
		String str= "&#%# 123 hello";
		
		str =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}
