import java.util.Scanner;
public class Lab1_3 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a value for ounces:");
			double ounces = input.nextDouble();
			double grams = 28.3495 * ounces;
			System.out.print(ounces);
			System.out.print(" ounces is " + grams + " grams");
	}



}