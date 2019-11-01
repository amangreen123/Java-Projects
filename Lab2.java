import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter  First  Number");
		double number1 = input.nextDouble();
		System.out.println(" Enter  Second   Number");
		double number2 = input.nextDouble();
		
		if(number1<number2) {
			System.out.println("Number 1 is less than Number 2");
		} else {
			System.out.println("Number 1 is greater than Number 2");
		}
		if(number1<=number2) {
			System.out.println(number1<number2);
		}
		if(number1==number2) {
			System.out.println(number1==number2);
			System.out.println("Numbers are  equal");
		}
		if(number1!=number2) {
			System.out.println("Numbers are not equal");
		}
		if(number1>number2) {
			System.out.println("Number 1 is less than Number 2");
		} else {
			System.out.println("Number 1 is greater than Number 2");
		}
		if(number1>=number2) {
			System.out.println(number1>=number2);
		}
		
		}
	}


