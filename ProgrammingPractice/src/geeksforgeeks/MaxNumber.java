package geeksforgeeks;

public class MaxNumber {

	public static void main(String[] args) {
		greatestOfThree(3,8,4);
	}
	 static int greatestOfThree(int A, int B, int C) {
	        int max= 0;
	        if(A>B && A>C){
	            max=A;
	        }
	        else if(B>A && B>C){
	            max=B;
	        }
	        else max=C;
	        return max;

	    }
}
