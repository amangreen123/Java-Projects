import java.util.Scanner;

public class Lab3_5 {
	
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Type in 3 numbers");
	
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	
   System.out.print(average(a,b,c));

}
	
	public static double average (double a, double b, double c) {
		return	(a + b + c)/3;  
	}

}





