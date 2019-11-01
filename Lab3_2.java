

public class Lab3_2 {
	
	public static void main(String[] args) {
		int lines = 0;
		
		
		for(int i = 100; i <= 500 ; i++) {
			
			if(i % 7 == 0 && i % 5 == 0) {
				
			
			}else if (i % 7 == 0) {
				System.out.print(i + " " );
				lines++;
				
				if(lines == 10) {
				System.out.println("\n");
				lines = 0;
			}
				
			}
			
			else if(i % 5 == 0) {
				System.out.print(i + " " );
				lines++;
				
			if(lines == 10) {
				System.out.println("\n");
				lines = 0;
				}
		}
			
		
			
			
			
			
		}
			
		}
}
		
		
	

		
	
	





