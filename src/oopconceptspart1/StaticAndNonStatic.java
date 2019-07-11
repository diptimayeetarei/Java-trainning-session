
package oopconceptspart1;

public class StaticAndNonStatic {
	int a=10;//non static global variable
	static String s="55";//static global variable
	public static void main(String args[])
	{
		//how to call static methods and variables
		//direct call and by class name
		sub();
		StaticAndNonStatic.sub();
		System.out.println(s);
		System.out.println(StaticAndNonStatic.s);
		//can I access static methods by object
		//ans Yes
		StaticAndNonStatic obj =new StaticAndNonStatic();
		obj.sub();//warning its not a good pratice
		//for non static methods we have to create objects
		//the scope of the global variable will be avalable acrross all the functions with some conditions
		//what condition if it os a sstatic variable then it will access through directly or class name but if it is a non static then we have to call by object
		
	}
	
	public void add()
	{

	}
	public static void sub()//static methods
	{

	}
}
