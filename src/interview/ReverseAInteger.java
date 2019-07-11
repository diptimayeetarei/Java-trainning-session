package interview;

public class ReverseAInteger {
	public static void main(String args[])
	{
		int a=12345;
		int rev=0;
		while(a!=0)
		{
			rev=rev*10 + a%10;//54321
			a=a/10;//1234
		}
		System.out.println(rev);
		
		//by using string buffer
		String num="1234567";
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
