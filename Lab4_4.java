
public class Lab4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s = "";
			int maxChar =  256;
			int count[] = new int[maxChar];
	        int length = s.length();
	        char ch[] = new char[s.length()];

	        for(int i = 0; i < length; i++)
	        {
	            count[s.charAt(i)]++;
	        }

	        for(int i = 0; i < length; i++)
	        {
	            ch[i] = s.charAt(i);
	            int find = 0;

	            for(int j = 0; j <= i; j++)
	            {
	                if(s.charAt(i) == ch[j] && !Character.isSpaceChar(ch[i]))
	                {
	                    find++;
	                }
	            }

	            if(find == 1)
	            {
	                System.out.println(s.charAt(i) + " occurs: " + count[s.charAt(i)]);
	            }
	}
	}
}
