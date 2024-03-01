package prepinsta.com;

import java.util.Scanner;

public class FrequencyOfCharactersInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		int[] freq = new int[str.length()];
		char[] charray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length() - 1; j++) {
				if (charray[i] == charray[j]) {
					freq[i]++;
					charray[j] = '0';
				}
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (charray[i] != '0' && charray[i] != ' ') {
				System.out.println(charray[i] + " : " + freq[i]);
			}
		}

	}
}
