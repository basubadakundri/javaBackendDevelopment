package core.java;

public class LongestString {

	public static void main(String[] args) {
		String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
		System.out.println(longest(names, 5));

	}

	static String longest(String names[], int n) {
		String nam = "";
       for(int i=0; i<n; i++){
			if (names[i].length() > nam.length()) {
				nam = names[i];
           }
       }
		return nam;
    }
}
