package prepinsta.com;

public class FindPerfectNumber {
     public static void main(String[] args) {

	int x = 2 ;
    int ans = 0 ;
     for(int i=1; i<x/2; i++) {
        if(x%i == 0) {
         ans = ans+i;
        }
     }
     System.out.println(ans==6);
   }
}
