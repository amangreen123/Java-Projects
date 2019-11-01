
public class Lab6_2 {

	public static class Square {
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
	
			
			public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				Square newSquare = new Square(40.0);
				Square newSquare2 = new Square(35.9);
				System.out.println(newSquare.getPerimeter());
				System.out.println(newSquare2.getPerimeter());

			}
	}
}


