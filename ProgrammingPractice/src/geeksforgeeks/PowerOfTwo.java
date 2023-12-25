package geeksforgeeks;

//Given a non-negative integer N. The task is to check if N is a power of 2. More formally,
//check if N can be expressed as 2x for some integer x. 
//Return true if N is power of 2 else return false.
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerofTwo(1));
	}

	public static boolean isPowerofTwo(long n){
		long power = 0;
			double ans = 1;
			while (ans <= n) {
				ans = Math.pow(2, power);
			if (ans == n) {
				return ans == n;
			}
			power++;
		}
			return false;
	}

}
