import java.util.Scanner;
import java.util.Random;


public class Lab2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Type your First Intger");
        int low = input.nextInt();

        System.out.println("Type your Second Intger");
        int high = input.nextInt();

        for (int i = 0; i < 3; i++){

            int result = r.nextInt(high-low) + low;

            System.out.println(result);

        }

    } 



}

		
		

	// system.out.println(Math.floor(Math.random()* num1) + num2 );














