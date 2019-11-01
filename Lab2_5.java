import java.util.Scanner;

public class Lab2_5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string 1:");
		String str1 = input.nextLine();
		
		System.out.print("Enter string 2:");
		String str2 = input.nextLine();
		
		//int result = str1.compareTo(str2);
		if (str1.charAt(0) < str2.charAt(0)) {
		   System.out.println(str1);
		   System.out.println(str2);
		} else {
		   System.out.println(str2);
		   System.out.println(str1);
		}	
		// System.out.println(result);
	
	}
		
	
	
}
		
		
	



















