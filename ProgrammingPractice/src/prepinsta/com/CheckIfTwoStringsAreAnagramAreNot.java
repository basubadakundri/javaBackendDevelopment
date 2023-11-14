package prepinsta.com;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagramAreNot {
   
	public static boolean check(String s1 , String s2) {
		
		if(s1.length()==s2.length()) {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)) {
        	return true;
        }
        else return false;
		}
		else return false;	
	}

	public static void main(String[] args) {
		System.out.println(check("bacd","dabc"));
	}

}
