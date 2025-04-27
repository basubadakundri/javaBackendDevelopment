package javaInterviewQuestionByNaveen;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {-1,0,1,2,3,5};
		int sum =0;
		int realSum =0;
		
		for(int i:a) {
			realSum += i;
		}
		for(int i=a[0]; i<=a[a.length-1];i++) {
			sum +=i;
		}
		System.out.println("Missing number is: "+(sum-realSum));
	}

}
