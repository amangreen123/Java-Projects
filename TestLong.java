
public class TestLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyLong ansV = new MyLong(1234);

			if(ansV.isEven())

			{

			System.out.println(ansV.getter()+" is Even.");

			}

			if(ansV.isOdd())

			{

			System.out.println(ansV.getter()+" is Odd.");

			}

			if(ansV.isPrime())

			{

			System.out.println(ansV.getter()+" is Prime.");

			}

			  

			long val = 9;

			if(MyLong.isEven(val))

			{

			System.out.println(val+" is Even.");

			}

			if(MyLong.isOdd(val))

			{

			System.out.println(val+" is Odd.");

			}

			if(MyLong.isPrime(val))

			{

			System.out.println(val+" is Prime.");

			}

			  

			MyLong ansV2 = new MyLong(98);

			if(MyLong.isEven(ansV2))

			{

			System.out.println(ansV2.getter()+" is Even.");

			}

			if(MyLong.isOdd(ansV))

			{

			System.out.println(ansV.getter()+" is Odd.");

			}

			if(MyLong.isPrime(ansV))

			{

			System.out.println(ansV.getter()+" is Prime.");

			}

			char ch[]={'1','2','3','4','5','6','7','8','9','1','2','3'};

			long  l1 = MyLong.parseLong(ch);

			System.out.println(l1);

			String str="23456789876565";

			long l2=MyLong.parseLong(str);

			System.out.println(l2);

			}
	}


