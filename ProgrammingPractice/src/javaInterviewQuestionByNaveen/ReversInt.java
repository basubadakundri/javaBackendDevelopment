package javaInterviewQuestionByNaveen;

public class ReversInt {
	public static void main(String[] args) {
		long num= 12345;
		long revNum =0;
		while(num>0) {
			revNum*= 10;
			revNum += num%10;
			num = num/10;
		}
		System.out.println(revNum);
		
		//With StringBuilder
		long num2 = 1234567;
		System.out.println(new StringBuilder(String.valueOf(num2)).reverse());
	}
	
}
