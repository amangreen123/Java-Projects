

import java.lang.*;

public class Lab6_3 {
	public class Bond { // JA
		double coupon;
		int payment;
		double interest;
		double valueMaturity;

		public Bond() {
			
		}

		public Bond(double c,int p,double i, double v){
			 coupon = c;
			 payment = p;
			 interest = i;
			valueMaturity = v;
		}
		
		public double getPrice(double interest,double valueMaturity,int payment,double coupon) {
			double price1 = 1/Math.pow(1+interest,payment);
			double price = coupon *( 1 - price1);
			double price2 = valueMaturity * price1 ;
			return price + price2;
		
			}

	}
	
	public static void main(String[] args) {
	Bond bond = new Bond(500,100,0.05,10000);
		System.out.println(bond);
	}
	
}

