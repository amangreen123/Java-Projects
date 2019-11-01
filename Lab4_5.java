
public class Lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array [] = new double [1000];
		int greaterThan = 0;
		int lessThan = 0;
		int sum = 0;
		double average;
	
		for(int i = 0; i< array.length; i++ ){
			array[i] = (double)(Math.random()*100);
			sum += array[i];
		}
		
		average = (double)sum / array.length;
	
	
		for(int i = 0; i < array.length; i++) {
			if(average > array[i]) {
				greaterThan++;
			
		 } else {
			lessThan++;
		}
		System.out.println(average);
		System.out.println(lessThan);
		System.out.println(greaterThan);
		
}
	}
}

