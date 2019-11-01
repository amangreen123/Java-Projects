// print them * test

public class MyLong {
	private long value;
	
	MyLong(){
		
	}
	
	public MyLong(long value){
		this.value = value;
	}
	
	public long getter(){
		return value;
	}
	
	public  boolean isOdd(){
		if(value % 2 != 0) {
			return true;
		}
		return false;
	}
	
	
	public boolean isEven(){
		
		if(value % 2 == 0) {
			return true;
			}
		return false;
	}
	public static boolean isOdd(MyLong ml) {
		
		if(ml.getter() % 2 != 0) {
			return true;
		}
		return false;
	 		
	}
	
	public static boolean isEven(MyLong ml) {
		
		if(ml.getter() % 2 == 0) {
			return true;
			}
		return false;
		}
	
	public boolean isPrime(){
		 boolean prime = true;
			for (int i = 2; i < (value - 1); i++) {
			if (value % i == 0) {
				prime = false;
					}
				}		
			return prime;	
			}

	public static boolean isPrime(MyLong va){
		boolean prime = true;
		for (int i = 2; i < (va.getter() - 1); i++) {
				if (va.getter() % i == 0) {
					prime = false;
				}
			}		
			return prime;	
	}
	
	public static boolean isPrime(long v){
		boolean prime = true;
		
		for (int i = 2; i < (v - 1); i++) {
			if (v % i == 0) {
				prime = false;
			}
		}
		
		return prime;
	}
	
	public static boolean isOdd(long value){
		return (new MyLong(value)).isOdd();
	}
	
	public static  boolean isEven(long value){
		return (new MyLong(value)).isEven();
	}
	
	boolean equals(long values){
		if (value == values)
			return true;
		return false;
	}
		
	boolean equals(MyLong va){
		if(va.getter() == value)
			return true;
		return false;
	}
	public static long parseLong(char [] chArray){

			String  longStr = "";
		for(int i = 0; i < chArray.length; i++) {
			int chVal = Character.getNumericValue(chArray[i]);
			longStr = longStr + chVal;
		}
		return Long.parseLong(longStr);
		
	}
	public static long parseLong(String valu) {
		return Long.parseLong(valu);
	}
	

}
