import java.util.Scanner;

public class Lab2_4 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println(" Enter  First  Character");
	char number1 = input.nextLine().charAt(0); // JA
	
	System.out.println(" Enter  Second Character");
	char number2 = input.nextLine().charAt(0);
	
	int result = number1 + number2;
	
	System.out.println("The result is " + result);
	}
}
