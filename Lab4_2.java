

public class Lab4_2 {
// 97-122
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int s = 0; s < 5; s++) {
		char [][] matrix = new char  [5][5];
		for(int r = 0; r < 5; r++) {
		
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (char)(Math.random() * (26  + 'a'));
//			System.out.print( Math.random() * (26  + 'a') );
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
			 System.out.print(matrix[i][j]);
			}
			System.out.println();
			}
		}
	}
}



