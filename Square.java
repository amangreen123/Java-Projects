//Create seperate files to test it 

public class Square {
//	public static class Squaree {
		private double width;
		
		public Square() {
			width = 1;
			
		}
		
		public Square(double w) {
			width = w;
		
		}
		public double getArea() {
			double area = width * width;
			return area;
		}
		
		public double getPerimeter() {
			double Perimeter = width * 4;
			return Perimeter;
		}
		

		
		//public SpSquare() {
			//double exactsquare = new Square();
			//new Square();
		//}


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square newSquare = new Squaree(40.0);
		Square newSquare2 = new Squaree(35.9);
		// JA: You had to print the different values
	}
}