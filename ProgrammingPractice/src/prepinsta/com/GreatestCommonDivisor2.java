package prepinsta.com;

public class GreatestCommonDivisor2 {
      public static void main(String[] args) {
	  int n1 = 25;
      int n2 = 20;
      
      while(n2%n1!=0) {
    	  int temp =n2;
    	  n2= n2%n1;
    	  n1 = temp;
      }
      System.out.println(n1);
   }
}
