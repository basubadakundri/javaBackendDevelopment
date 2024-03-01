package core.java;

public class ReversingTheVowel {

	public static void main(String[] args) {
		System.out.println(modify("abecijop"));

	}

	static String modify (String s)
    {
       String str = "";
       for(int i=0; i<s.length(); i++){
           if(isVowel(s.charAt(i))){
				str = str + s.charAt(i);
           }
       }
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		StringBuilder modifiedText = new StringBuilder(s);
		int index = 0;
		for (int j = 0; j < s.length(); j++) {
			if (isVowel(s.charAt(j))) {
				modifiedText.setCharAt(j, rev.charAt(index));
				index++;
			}
		}
		return modifiedText.toString();

    }

	static boolean isVowel(char c) {
		if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
			return true;
		} else
			return false;
	}
}
