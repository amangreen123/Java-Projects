
public class Lab4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in       cm|cm      in");
		System.out.println("-----------------------");
		
		for(int i = 1,j = 1; i <50; i++,j+=5) {
			//Get conversion of in to cm
			//System.out.printf("|%5d\n", i );
			
			//Divider
		
			System.out.printf("%3d   %5.2f|%3d   %5.2f\n", i, i*2.54,j,j/2.54);
			
			// get conversion of cm to in
			//System.out.printf("|%5d\n", i);
		
		}
		}
	}


