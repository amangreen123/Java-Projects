import java.util.Scanner;
import java.util.stream.IntStream;

public class Lab3_1 {
	
	public static void main(String[] args) {
		int evens = 0;
        int average = 0;
        int total = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("how many numbers do you want to enter?");
		// JA: You were supposed to read until reading 0
        int a = input.nextInt();
        int numbers[] = new int[a];
        
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
            evens++;
            }
        }

        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);
        
        for(int i=0; i< numbers.length; i++){
            total = total + numbers[i];
        }

        average = total / numbers.length;

        System.out.println("The average is: " + average);
        System.out.println("the number of evens is: " + evens);
	}		
}	
	

	
