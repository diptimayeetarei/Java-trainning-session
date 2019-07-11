package interview;

public class ReverseAString {
	static String s="Hundred year live";
	
	public static void main(String args[])
	{
		
		//using for loop
	String rev="";
	//System.out.println(s.rev);Why it is showing error because as string is immutable
	int stringlen=s.length();
	for(int i=stringlen-1;i>=0;i--)
	{
		
		rev=rev+s.charAt(i);//evil
		System.out.println(rev);
	}
	System.out.println(rev);
	
		//using string buffer class
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
		//String buffer is a mutable class so we can use reverse method

}
	
	
	
}
