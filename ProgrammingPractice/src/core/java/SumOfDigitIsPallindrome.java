package core.java;

public class SumOfDigitIsPallindrome {

	public static void main(String[] args) {
		System.out.println(isDigitSumPalindrome(56));
	}

	static int isDigitSumPalindrome(int N) {
        int sum=0;
        while(N>0){
           sum=sum+N%10;
           N= N/10;
        }
        int rev=0;
        int m=sum;
        while(sum>0){
			rev = rev * 10;
			rev = rev + sum % 10;
           sum= sum/10;
        }
        if(m==rev){
            return 1;
        }
        else return 0;
    }

}
