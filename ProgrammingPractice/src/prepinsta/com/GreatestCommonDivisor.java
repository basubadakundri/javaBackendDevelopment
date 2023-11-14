package prepinsta.com;

	public class GreatestCommonDivisor {
		public static void main(String[] args) {
	       int a = 15;
	       int b = 20;
	       int c = 0;
	       for(int i=1; i<a; i++) {
	    	   if(a%i==0 && b%i==0) {
	    		   c=i;
	    	   }
	       }
	       System.out.println(c);
		}
	}
