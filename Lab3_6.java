import java.util.Scanner;
public class Lab3_6 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("enter a string: ");
		String a = input.nextLine();
	   char[] chars = a.toCharArray();
	   int vowels = 0;
	        
	    for (int i = 0; i < chars.length; i++)
	        {
	            if (chars[i] == 'a') {
	                vowels++;
	            }
	            if (chars[i] == 'e') {
	                vowels++;
	            }
	            if (chars[i] == 'i') {
	                vowels++;
	            }    
	            if (chars[i] == 'o') {
	                vowels++;
	            }
	            if (chars[i] == 'u') {
	                vowels++;
	            }
	        }
	        System.out.println("there are " + vowels + " vowels");





	        }
	}

