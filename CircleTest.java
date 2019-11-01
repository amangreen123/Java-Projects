import java.util.Scanner;

public class CircleTest {
	
	public static void main(String args[])
	{
	double a1, b1, r1, p, q, a2, b2, r2;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the centre coordinates of the first circle: ");
	a1 = input.nextDouble();
	b1 = input.nextDouble();
	System.out.print("Enter the radius of the first circle: ");
	r1 = input.nextDouble();
	Circle circle1 = new Circle(a1, b1, r1);
	System.out.println("Area = " + circle1.getArea());
	System.out.println("Perimeter = " + circle1.getPerimeter());
	System.out.print("\nEnter the coordinates of a point: ");
	p = input.nextDouble();
	q = input.nextDouble();
	if(circle1.contain(p, q)) 
		System.out.println("The point is inside the Circle");
	else 
		System.out.println("The point is outside the Circle");

	System.out.print("\nEnter the center coordinates of the second circle: ");
	a2 = input.nextDouble();
	b2 = input.nextDouble();
	System.out.print("Enter the radius of the second circle: ");
	r2 = input.nextDouble();
	Circle circle2 = new Circle(a2, b2, r2);
	if(circle1.contains(circle2)) 
		System.out.println("The second circle is inside the first circle");
	else 
		System.out.println("The second circle is outside the first circle");
	if(circle1.overlaps(circle2)) 
		System.out.println("\nThe second overlaps the first circle");
	else 
		System.out.println("\nThe second circle does not overlap the first circle");
	}

}

