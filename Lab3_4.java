import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Type in a number ");
			 
		int n = input.nextInt();
		    
		 if ( n % 2 == 0) {
			 System.out.println("That number is not prime");
		 }
		 
		 // JA: This won't work
		 if(n > 15000) {
			 System.out.println("n is Greater than 15000");
		 }else {
			 System.out.println("15000 is greater"); 
		 }
		 
	}
}
		
