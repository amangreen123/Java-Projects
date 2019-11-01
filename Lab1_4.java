import java.util.Scanner;

public class Lab1_4 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for mass:");
		double mass = input.nextDouble();
		double lightspeed = 299972458 * 299972458;
		double energy = mass * lightspeed;
		System.out.print("The Energy is "+ energy );
	}
}

