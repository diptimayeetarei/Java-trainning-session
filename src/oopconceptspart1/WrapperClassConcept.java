package oopconceptspart1;

public class WrapperClassConcept {
	public static void main(String args[])
	{
		String s="100";
		System.out.println(s+100);//100100
		//data conversion from String to integer
		//to convert that 100 to Ineger we have to convert String to integer value
		int i=Integer.parseInt(s);
		System.out.println(i+100);//200
		
		//There are different ty[e pof conversion double char String Boolean Int
		//String to double conversion
		String sc="123.45";
		double d=Double.parseDouble(sc);
		System.out.println(d);
		//String to Boolean
		String sct="true";
		Boolean b=Boolean.parseBoolean(sct);
		System.out.println(b);
		//integer to String convesion
		int abc=10;
		String sg=String.valueOf(abc);
		System.out.println(sg);
	}
}
//100100
//200
//123.45
//true
//10
