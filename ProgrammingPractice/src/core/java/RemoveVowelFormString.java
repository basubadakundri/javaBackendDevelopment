package core.java;

public class RemoveVowelFormString {

	public static void main(String[] args) {
		System.out.println(removeVowels("hello world"));

	}
	   static String removeVowels(String S) {
	        String newS="";
	        for(int i=0; i<S.length(); i++){
	          if(checkVowel(S.charAt(i))== false){
	              newS= newS+S.charAt(i);
	          }  
	        }
	        return newS;
	        
	    }
	    
	    static boolean checkVowel(char c){
	        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
	            return true;
	        }
	        else return false;
	    }

}
